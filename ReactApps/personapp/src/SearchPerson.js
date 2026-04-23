import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
function SearchPerson()
{
    const navigate = useNavigate();
    const [pid, setPid] = useState(0);
    const [pinfo, setPinfo] = useState({});

    const getPersonInfo = (e) =>
    {
        e.preventDefault();
    
        axios({
            url: "http://localhost:9087/person/" + pid,
            method: "GET",
            data: pinfo,
        })
        .then((res) =>{
            setPinfo(res.data);
            console.log(res.data);
        })
        .catch((res)=>{
            alert("Not Found....")
        });
    
    }
    

    return(
        <div>
            <div className="row">
            <div className="col-md-3"></div>
                <div className="col-md-6">
                    <label>Person ID</label>
                    <input type="text"  name="pid" className="form-control"
                    onChange={(e)=>{setPid(e.target.value)}}/>
                    
                    <input type="button"  value="Search Emp"  className="btn btn-success" onClick={getPersonInfo} />

                    <br />
                    <br />
                    <table className="table">
                        <thead>
                        <tr>
                                <th>Person ID</th>
                                <th>Person Name</th>
                                <th>Person Email</th>
                                <th>Person Phone</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                {pinfo.pid}
                            </td>
                            <td>
                                {pinfo.pname}
                            </td>
                            <td>
                                {pinfo.email}
                            </td>
                            <td>
                                {pinfo.phone}
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div className="col-md-3"></div>
            </div>
        </div>
    );
}

export default SearchPerson;