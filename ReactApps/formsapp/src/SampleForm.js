
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
            <div className="row">
                <div className="col-md-3"></div>
                <div className="col-md-6">
                    <div className="card">
                        <div className="card-header">
                            <b>Sample Form</b>
                        </div>
                        <div className="card-body">
                            <form>
                                <label>Enter a Name</label>
                                <input type="text"  name="txtPname" className="form-control" onChange={getPname} />
                                <label>Age of Person</label>
                                <input type="text"  name="txtAge" className="form-control" onChange={(e)=>{setAge(e.target.value)}} />
                                <br />
                                <input type="button"  value="Click Me" className="btn btn-primary" onClick={printPname} />
                            </form>
                            <h2>{result}</h2>
                        </div>
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    );
}

export default SampleForm;