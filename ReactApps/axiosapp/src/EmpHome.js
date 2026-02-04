import axios from "axios";
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

function EmpHome()
{
    const {id} = useParams();
    const [empinfo, setEmpInfo] = useState({});
    useEffect(()=>{
        axios.get("http://localhost:2345/Employee/" + id)
        .then((res)=>{
            setEmpInfo(res.data);
        });
    }, []);

    return(
        <div>
            <h1>Employee Home</h1>
            <h1>{id}</h1>
            <table width="100%"  border={1}>
                <thead>
                <tr>
                    <th>Emp ID</th>
                    <th>Emp Name</th>
                    <th>Emp Job</th>
                    <th>Emp Salary</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>
                </thead>
                <tbody>
                
                            <tr>
                                <td>{empinfo.id}</td>
                                <td>{empinfo.ename}</td>
                                <td>{empinfo.job}</td>
                                <td>{empinfo.salary}</td>
                                <td>{empinfo.email}</td>
                                <td>{empinfo.pswd}</td>
                            </tr>

                </tbody>
            </table>
        </div>
    );
}

export default EmpHome;