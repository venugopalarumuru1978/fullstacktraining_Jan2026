import React, { useEffect, useState } from "react";

function GetStdData()
{
    const [stdinfo, setStdInfo] = useState([]);  // array format

    useEffect(()=>{
        fetch("http://localhost:1234/Student")
        .then(response => response.json())
        .then((data)=>{
            console.log(data);
            setStdInfo(data);
        });
    },[])

    return(
        <div>
            <table width="100%" border="1">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Student Name</th>
                    <th>Course</th>
                    <th>Fees</th>
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
                        </tr>)
                    })
                }
                </tbody>
            </table>
        </div>
    );
}

export default  GetStdData;