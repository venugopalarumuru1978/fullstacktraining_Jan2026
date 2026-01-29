import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function GetStdData()
{
    const [stdinfo, setStdInfo] = useState([]);  // array format
    const navigate = useNavigate();
    const [count, setCount] = useState(0);
    useEffect(()=>{
        fetch("http://localhost:1234/Student")
        .then(response => response.json())
        .then((data)=>{
            console.log(data);
            setStdInfo(data);
        });
    },[count])

    const delStd = (id)=>{
        fetch("http://localhost:1234/Student/" + id, {
            method:"DELETE",
            headers:{
                "Content-type": "application/json; charset=UTF-8"
            }
        })
        .then(response => response.json())
                .then((data)=>{
                    console.log(data);
                    setCount(count+1);
                    navigate("/allstds");
            });
    }

    const passparams = (id) =>{
        let url = "/uptstd/" + id; 
        navigate(url);
    }
    
    return(
        <div>
            <p style={{textAlign:"center"}}>

                <input type="button"  value="New Student" onClick={()=>{navigate("/newstd")}} />

            </p>
            <table width="100%" border="1">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Student Name</th>
                    <th>Course</th>
                    <th>Fees</th>
                    <th>Operations</th>
                </tr>
                </thead>
                <tbody>
                {
                    stdinfo.map((std)=>{
                        return(
                        <tr>
                            <td>{std.id}</td>
                            <td>{std.sname}</td>
                            <td>{std.course}</td>
                            <td>{std.fees}</td>
                            <td>
                                <input type="button" value="Delete Std" onClick={()=>{delStd(std.id)}} />
                                &nbsp;&nbsp;&nbsp;
                                <input type="button"  value="Modify Std " onClick={()=>{passparams(std.id)}} />    
                            </td>
                        </tr>)
                    })
                }
                </tbody>
            </table>
        </div>
    );
}

export default  GetStdData;