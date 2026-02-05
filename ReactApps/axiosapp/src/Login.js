import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

function Login(props)
{
    const navigate = useNavigate();
    const [uname, setUname] = useState('');
    const [empinfo, setEmpInfo] = useState([]);
    const [pswd, setPswd] = useState('');
    const [msg, setMsg] = useState('');


    const getUrl = (id) =>{
        let url = "/wemp/" + id;
        navigate(url);
    }

    const LoginCheck = (e)=>{
        
        e.preventDefault()
        if(uname==="Admin" && pswd==="admin@123")
        {
            props.setLoginStatus('admin')
            navigate("/viewall");
        }
        else
        {
            axios.get("http://localhost:2345/Employee")
            .then((res)=>{
                console.log(res.data);
                setEmpInfo(res.data);
            });
            let empchk = false;
            for(let i=0;i<empinfo.length;i++)
            {
                if(empinfo[i].email===uname && empinfo[i].pswd === pswd)
                    {
                        props.setLoginStatus('user')
                        empchk=true;
                        //navigate("/wemp");
                        getUrl(empinfo[i].id);
                    }
            }

            if(empchk===false)
                setMsg("Please check username / password");
        }
    }

    return(
        <div>
            
                <form method="POST" onSubmit={LoginCheck}>
                <p style={{textAlign:"center"}}>
                    <input type="text"  name="txtUname" placeholder="User Name" onChange={(e)=>{setUname(e.target.value)}} />
                    <br />
                    <input type="password"  name="txtPass" placeholder="Password" onChange={(e)=>{setPswd(e.target.value)}} />
                    <br />
                    <br />
                    <input type="submit"  value="Click Me" />
                    <br />
                    </p>
                </form>
            <p style={{color:"red"}}>{msg}</p>
        </div>
    );
}

export default Login;