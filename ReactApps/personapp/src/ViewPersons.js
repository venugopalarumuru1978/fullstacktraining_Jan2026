import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function ViewPersons()
{
    const [pinfo, setPinfo] = useState([]);
    const [cnt, setCnt] = useState(0);
    const navigate = useNavigate();
    useEffect(()=>{
        axios.get('http://localhost:9087/person')
            .then(
                response=>{
                    setPinfo(response.data);
                    console.log(response.data);
                })
        },[cnt]);

        const delPerson =(pid)=>{
            axios.delete('http://localhost:9087/person/' + pid)
            .then(response =>{
                console.log(response.data);
                setCnt(cnt+1);
            });
        }

        const GetPerson= (pid) =>{
            navigate("/updatePerson/" + pid);
        }

    return(
        <div>
        <div className="row">
                <div className="col-md-1"></div>
                <div className="col-md-10">
                    <div className="card">
                        <div className="card-header">All Person Info</div>
                        <div className="card-body">
                            <table className="table table-dark">
                                <thead>
                                <tr>
                                    <th>Person ID</th>
                                    <th>Person Name</th>
                                    <th>Person Email</th>
                                    <th>Person Phone</th>
                                    <th>Operations</th>
                                </tr>
                                </thead>
                                <tbody>
                                {
                        pinfo.map((p)=>(
                        <tr>
                            <td>{p.pid}</td>
                            <td>{p.pname}</td>
                            <td>{p.email}</td>
                            <td>{p.phone}</td>
                            <td>
                                <input type="button" value="Delete" className="btn btn-danger" onClick={()=>{delPerson(p.pid)}} />
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="button" value="Modify" className="btn btn-warning" onClick={()=>{GetPerson(p.pid)}} />
                            </td>
                        </tr>
                    ))
                }
                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <div className="col-md-1"></div>
            </div>
        </div>
    );
}

export default ViewPersons;