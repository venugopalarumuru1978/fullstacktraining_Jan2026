import React from "react";
import Test2 from "./Test2";

function Test1(props)
{
        let sname = "Kiran";

    return(
        <div>
            <h1>Child Component</h1>
            <h2>Person Name : {props.sname}</h2>
            <h2>Person Age : {props.age}</h2>
            <h2>Person Location : {props.location}</h2>

            <Test2 sname={sname}  />
        </div>
    );
}

export default Test1;

