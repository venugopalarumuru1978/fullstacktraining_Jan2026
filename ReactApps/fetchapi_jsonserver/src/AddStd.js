import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

function AddStd()
{
    const navigate = useNavigate();
    const [stdinfo, setStdInfo] = useState(
        {
            "id":0,
            "sname":"",
            "course":"",
            "fees":0
        }); 

        const NewStudent = ()=>{
                fetch("http://localhost:1234/Student", {
                    method:"POST",
                    headers:{
                        "Content-type": "application/json; charset=UTF-8"
                    },
                    body: JSON.stringify(stdinfo)
                })
                .then(response => response.json())
                .then((data)=>{
                    console.log(data);
                    navigate("/allstds");
            });
        }

    return(
        <div>
            <form method="POST">
                <label>ID</label>
                <br />
                <input type="text"  name="txtID"
                onChange={(e)=>{setStdInfo({...stdinfo, id:e.target.value})}} />
                <br /><label>Student Name</label><br />
                <input type="text"  name="txtName" 
                onChange={(e)=>{setStdInfo({...stdinfo, sname:e.target.value})}} />
                <br /><label>Student Course</label><br />
                <input type="text"  name="txtCourse" 
                onChange={(e)=>{setStdInfo({...stdinfo, course:e.target.value})}} />
                <br /><label>Course Fees</label><br />
                <input type="text"  name="txtFees" 
                onChange={(e)=>{setStdInfo({...stdinfo, fees:e.target.value})}} />
                <br /><br />
                <input type="button"  value="Add Student" onClick={NewStudent} />
            </form>
        </div>
    );
}

export default AddStd;
