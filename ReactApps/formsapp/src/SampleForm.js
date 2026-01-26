
import React, { useState } from "react";

function SampleForm()
{
    const [pname, setPname] = useState('');
    const [age, setAge] = useState(0);
    
    const [result, setRes] = useState('');

    const getPname = (e) =>{
        setPname(e.target.value);
    }

    const  printPname = ()=>{
        //alert(pname + "==" + age);
        let rinfo = pname;
        rinfo = rinfo + "<===>" + age;
        setRes(rinfo);
    }
    return(
        <div>
            <form>
                <label>Enter a Name : </label>
                
                <input type="text"  name="txtPname" onChange={getPname} />
                <br />
                <label>Age of Person</label>
                <input type="text"  name="txtAge" onChange={(e)=>{setAge(e.target.value)}} />
                <br />
                <input type="button"  value="Click Me" onClick={printPname} />
                <h2>{result}</h2>
            </form>
        </div>
    );
}

export default SampleForm;