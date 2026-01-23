import React from "react";
import { Link } from "react-router-dom";

function Navbar()
{
    return(
        <div>
            <p style={{textAlign:"center"}}>
                <Link to="/home">Home</Link> 
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/dpage">DemoPage</Link> 
                &nbsp;&nbsp;|&nbsp;&nbsp;
                <Link to="/about">About Us</Link> 
            </p>           
        </div>
    );
}

export default Navbar;