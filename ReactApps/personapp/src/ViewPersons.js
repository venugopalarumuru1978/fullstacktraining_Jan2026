import axios from "axios";
import { useEffect, useState } from "react";

function ViewPersons()
{
    const [pinfo, setPinfo] = useState([]);

    useEffect(()=>{
        axios.get('http://localhost:9087/person')
            .then(
                response=>{
                    setPinfo(response.data);
                    console.log(response.data);
                })
        },[]);
    
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