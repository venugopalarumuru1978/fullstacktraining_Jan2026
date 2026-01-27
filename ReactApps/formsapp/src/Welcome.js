import React from "react";
import { useNavigate } from "react-router-dom";

function Welcome()
{
    const navigate = useNavigate();
    
return(
    <div>
        <h1>Welcome to Admin &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
            <input type="button"  value="Logout"  
            className="btn btn-danger" onClick={()=>{navigate('/login')}} />
        </h1>
    </div>
);
}

export default Welcome;
