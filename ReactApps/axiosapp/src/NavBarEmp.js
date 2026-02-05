import React from "react";
import { Link } from "react-router-dom";

function NavBarEmp()
{
    return(
        <div>
            <p style={{textAlign:"center"}}>
                <Link to="/wemp">Home</Link>
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/cpwd">Change Password</Link>
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/logout">Logout</Link>
            </p>
        </div>
    );
}

export default NavBarEmp;