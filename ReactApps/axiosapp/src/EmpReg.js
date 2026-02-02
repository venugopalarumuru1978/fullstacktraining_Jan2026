import React, { useState } from "react";
import axios from 'axios';
import { useNavigate } from "react-router-dom";

function EmpReg()
{
    const navigate = useNavigate();
    const [formErrors, setFormErrors] = useState({});
    const [msg, setMsg] = useState('');
    const [empinfo, setEmpInfo] = useState({
        "id": 0,
        "ename": "",
        "job": "",
        "salary": 0.0,
        "email":"",
        "pswd":""
    });


    const getEmpInfo = (e) =>{
        e.preventDefault();
        if(Validations()===false)
        {
            //console.log(empinfo);
            axios.post("http://localhost:2345/Employee", empinfo)
            .then((response) => {
                console.log(response.data);
                setMsg('Emp Added Successfully....');
                navigate('/viewall');
            })
            .catch((err) => {
                setMsg("Not Added.....");
                console.log(err)
            });
        }
    }

    const  Validations = ()=>{

        const errors = {};
        let flag = false;

    if(empinfo.id===0)
    {
        errors.idErr = "Emp No is Required";
        flag = true;
    }
    if(empinfo.ename==="")
    {
        errors.enameErr = "Emp Name is Required";
        flag = true;
    }
    if(empinfo.job==="")
    {
        errors.jobErr = "Job is Required";
        flag = true;
    }
    if(empinfo.salary===0.0)
    {
        errors.salErr = "Salary is Required";
        flag = true;
    }
    if(empinfo.email==="")
    {
        errors.emailErr = "Email is Required";
        flag = true;
    }
    const regex = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/i
    if(!regex.test(empinfo.email))
    {
        errors.emailInvalidErr = "Email is not Valid";
        flag = true;
    }
    if(empinfo.pswd==="")
    {
        errors.pwdErr = "Password No is Required";
        flag = true;
    }

    let pwdlength = empinfo.pswd.length;
    if(!(pwdlength>= 8 && pwdlength<=20))
    {
        errors.pwdlenErr = "Password must be b/w 8 - 20 chars only";
        flag = true;
    }
        setFormErrors(errors);
        return flag;
    }

    return(
        <div>
                <form name="frmReg" onSubmit={getEmpInfo}>
                    
                    <input type="text" name="txtID" placeholder="Emp ID"
                    pattern="[0-9]{5}" title="Five digit emp code"
                    onChange={(e)=>{setEmpInfo({...empinfo,id:e.target.value})}} />
                    <br />
                    <p style={{"color":"red"}}>{formErrors.idErr}</p>
                    <br />
                    <input type="text" name="txtEname" placeholder="Emp Name"
                    pattern="[a-zA-Z]{5,50}" title="Emp Name length b/w 5 to 50 chars"
                    onChange={(e)=>{setEmpInfo({...empinfo,ename:e.target.value})}} />
                    <br />
                    <p style={{"color":"red"}}>{formErrors.enameErr}</p>
                    <br />
                    <input type="text" name="txtJob" placeholder="Emp Job"
                    onChange={(e)=>{setEmpInfo({...empinfo,job:e.target.value})}} />
                    <br />
                    <p style={{"color":"red"}}>{formErrors.jobErr}</p>
                    <br />
                    <input type="number" min="10000" max="100000" name="txtSal" placeholder="Emp Salary"
                    onChange={(e)=>{setEmpInfo({...empinfo,salary:e.target.value})}} />
                    <br />
                    <p style={{"color":"red"}}>{formErrors.salErr}</p>
                    <br />
                    <input type="email" name="txtEmail" placeholder="Emp Email"
                    onChange={(e)=>{setEmpInfo({...empinfo,email:e.target.value})}} />
                    <br />
                    <p style={{"color":"red"}}>{formErrors.emailErr}</p>
                    <p style={{"color":"red"}}>{formErrors.emailInvalidErr}</p>
                    <br />
                    <input type="text" name="txtPswd" placeholder="Emp Password"
                    onChange={(e)=>{setEmpInfo({...empinfo,pswd:e.target.value})}} />
                    <br />
                    <p style={{"color":"red"}}>{formErrors.pwdErr}</p>
                    <p style={{"color":"red"}}>{formErrors.pwdlenErr}</p>
                    <br />
                    <input type="submit"  value="Regiser Emp" />
                    <h2>{msg}</h2>
                </form>
        </div>
    );
}

export default EmpReg;