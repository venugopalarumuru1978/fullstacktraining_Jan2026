import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function UpdateStd()
{
    const navigate = useNavigate();
    const [stdinfo, setStdInfo] = useState({});
     const { id } = useParams();

        useEffect(()=>{
            fetch("http://localhost:1234/Student/" + id)
            .then(response => response.json())
            .then((data)=>{
                console.log(data);
                setStdInfo(data);
            });
        },[id])


        const ModStudent = ()=>{
                fetch("http://localhost:1234/Student/" + id, {
                    method:"PUT",
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
            <h1>{id}</h1>
            <form method="POST">
                <label>ID</label>
                <br />
                <input type="text"  name="txtID" value={stdinfo.id}
                onChange={(e)=>{setStdInfo({...stdinfo, id:e.target.value})}} />
                <br /><label>Student Name</label><br />
                <input type="text"  name="txtName" value={stdinfo.sname}
                onChange={(e)=>{setStdInfo({...stdinfo, sname:e.target.value})}} />
                <br /><label>Student Course</label><br />
                <input type="text"  name="txtCourse" value={stdinfo.course}
                onChange={(e)=>{setStdInfo({...stdinfo, course:e.target.value})}} />
                <br /><label>Course Fees</label><br />
                <input type="text"  name="txtFees" value={stdinfo.fees}
                onChange={(e)=>{setStdInfo({...stdinfo, fees:e.target.value})}} />
                <br /><br />
                <input type="button"  value="Modify Student" onClick={ModStudent} />
            </form>
        </div>
    );
}

export default UpdateStd;
