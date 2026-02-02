import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function ViewAllEmps()
{
    const [change, setChange] = useState(false);
    const [empinfo, setEmpInfo] = useState([]);
    const navigate = useNavigate();

    useEffect(()=>{
        axios.get('http://localhost:2345/Employee')
        .then((response)=>{
            setEmpInfo(response.data);
            console.log(response.data);
        })
        .catch((err)=>{
            console.log(err);
        });
    },[change]);

    const delEmp = (id)=>{
        if(window.confirm("Are u sure to delete")===true)
        {
            axios.delete("http://localhost:2345/Employee/" + id)
            .then((response)=>{
                setChange(true);
                console.log("Deleted");
            })
            .catch((err)=>{
                console.log(err);
            })
        }
    }

    const getEmp = (id)=>{
        let url = "/empmod/" + id;
        navigate(url);
    }
    return(
        <div>
            <h1>All Employees</h1>
            <table width="100%"  border={1}>
                <thead>
                <tr>
                    <th>Emp ID</th>
                    <th>Emp Name</th>
                    <th>Emp Job</th>
                    <th>Emp Salary</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Operations</th>
                </tr>
                </thead>
                <tbody>
                {
                    empinfo.map((emp)=>{
                        return(
                            <tr key={emp.id}>
                                <td>{emp.id}</td>
                                <td>{emp.ename}</td>
                                <td>{emp.job}</td>
                                <td>{emp.salary}</td>
                                <td>{emp.email}</td>
                                <td>{emp.pswd}</td>
                                <td>
                                    <input type="button"  value="Delete" onClick={()=>{delEmp(emp.id)}} />
                                    &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                                    <input type="button"  value="Modify" onClick={()=>getEmp(emp.id)}  />
                                </td>
                            </tr>
                        )
                    })
                }
                </tbody>
            </table>
        </div>
    );
}

export default ViewAllEmps;