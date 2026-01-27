import React from "react";
import { Link } from "react-router-dom";

function NavBar()
{
    return(
        <div>
            <p style={{textAlign:"center"}}>
                <Link to="/pg1">Page-1</Link>
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/pg2">Page-2</Link>
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/pg3">Page-3</Link> 
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/login">Login</Link> 
            </p>
        </div>
    );
}

export default NavBar;