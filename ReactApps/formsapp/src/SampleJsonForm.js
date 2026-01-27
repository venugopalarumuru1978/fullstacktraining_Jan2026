import React, { useState } from "react";

function SampleJsonForm()
{
    //const [std, setStd] = useState({}); // empty json object
    const [std, setStd] = useState({
        "sname":"",
        "gender":"",
        "location":""
    });
    const [stdres, setStdres] = useState('');

    const getInfo = () =>{
        console.log(std);
        let res = stdres + "Student Name : " + std.sname;
        res = res + "<br />Gender : " + std.gender;
        res = res + "<br />Location : " + std.location;
        setStdres(res);
    }


    return(
        <div>
            <div className="row">
                <div className="col-md-2"></div>
                <div className="col-md-8">
                    <div className="card">
                        <div className="card-header">
                            <b>Sample JSON Form</b>
                        </div>
                        <div className="card-body">
                        <label>Student Name </label>
            
            <input type="text"  name="txtSname" className="form-control"
            onChange={(e)=>{setStd({...std, sname:e.target.value})}} />
            <br />
            <label>Gender</label><br />
            <input type="radio"  name="rdoGender"  value="Male"
            onChange={(e)=>{setStd({...std, gender:e.target.value})}} />
            <label>Male</label>
            &nbsp;&nbsp;
            <input type="radio"  name="rdoGender"  value="Female"
            onChange={(e)=>{setStd({...std, gender:e.target.value})}} />
            <label>Female</label>
            <br /><br />
            <label>Location</label>
            <select name="ddlCity" className="form-select" onChange={(e)=>{setStd({...std, location:e.target.value})}}>
                <option value="Hyderabad">Hyderabad</option>
                <option value="Amaravathi">Amaravathi</option>
                <option value="Bangalore">Bangalore</option>
            </select>
            <br />
            <input type="button" value="Click me" className="btn btn-primary" onClick={getInfo} />
            <br />
            <p>{stdres}</p>
                        </div>
                    </div>
                </div>
                <div className="col-md-2"></div>
            </div>
        </div>
    );
}

export default SampleJsonForm;