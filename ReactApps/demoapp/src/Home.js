import React from "react";
import './Test.css';
function Home()
{

    let x = 100;
    let str = "Online Dotnet Fullstack";
    let y = 12.34;

    return(
        <div>            
                <h1 style={{color:"green", backgroundColor:"yellow"}}>This is React Online Session.</h1>
                <h2 style={{color:"red"}}>String Value is : {str}</h2>
                <h2 style={{color:"red"}}>X value is : {x}</h2>
             
                <h2 style={{color:"red"}}>Float Value : {y}</h2>
                <h2 className="textcolor">Addition : {x+y}</h2>
        </div>
    );
}

export default Home;