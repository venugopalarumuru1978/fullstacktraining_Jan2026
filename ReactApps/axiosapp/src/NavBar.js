import React from "react";
import { Link } from "react-router-dom";

function NavBar()
{
    return(
        <div>
            <p style={{textAlign:"center"}}>
                <Link to="/viewall">All Employees</Link>
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/empreg">Employee Register</Link>
            </p>
        </div>
    );
}

export default NavBar;