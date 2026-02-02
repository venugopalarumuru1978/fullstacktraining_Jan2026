import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function ModifyEmp()
{
    const navigate = useNavigate();
    const {id} = useParams();
    const [empinfo, setEmpInfo] = useState({});

    useEffect(()=>{
        axios.get('http://localhost:2345/Employee/' + id)
        .then((response)=>{
            setEmpInfo(response.data);
            console.log(response.data);
        })
        .catch((err)=>{
            console.log(err);
        });
    },[]);

    const updateEmp = () =>{
        axios.put("http://localhost:2345/Employee/" + id, empinfo)
        .then((response)=>{
            navigate("/viewall");
        })
        .catch((err)=>{
            console.log(err);
        })
    }

    return(
        <div>
            <h1>Modify</h1>
            <form name="frmReg" onSubmit={updateEmp}>
                    
                    <input type="text" name="txtID" placeholder="Emp ID"
                    pattern="[0-9]{5}" title="Five digit emp code"  value={empinfo.id}
                    onChange={(e)=>{setEmpInfo({...empinfo,id:e.target.value})}} />
                    <br />
                   
                    <input type="text" name="txtEname" placeholder="Emp Name" value={empinfo.ename}
                    pattern="[a-zA-Z]{5,50}" title="Emp Name length b/w 5 to 50 chars"
                    onChange={(e)=>{setEmpInfo({...empinfo,ename:e.target.value})}} />
                    <br />
                  
                    <input type="text" name="txtJob" placeholder="Emp Job" value={empinfo.job}
                    onChange={(e)=>{setEmpInfo({...empinfo,job:e.target.value})}} />
                    <br />
                   
                    <input type="number" min="10000" max="100000" 
                    name="txtSal" placeholder="Emp Salary" value={empinfo.salary}
                    onChange={(e)=>{setEmpInfo({...empinfo,salary:e.target.value})}} />
                    <br />
                   
                    <input type="email" name="txtEmail" placeholder="Emp Email"
                    value={empinfo.email}
                    onChange={(e)=>{setEmpInfo({...empinfo,email:e.target.value})}} />
                    <br />
                   
                    <input type="text" name="txtPswd" placeholder="Emp Password"
                    value={empinfo.pswd}
                    onChange={(e)=>{setEmpInfo({...empinfo,pswd:e.target.value})}} />
                    
                    <br />
                    <input type="submit"  value="Update Emp" />
                    
                </form>

        </div>
    );
}

export default  ModifyEmp;