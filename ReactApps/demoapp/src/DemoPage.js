
import React from "react";

function  DemoPage()
{
    let cityinfo = ["Hyderabad", "Amaravathi", "Bangalore", "Pune", "Vizag", "Delhi"];
    let  empinfo =[
        {"empno":1001, "ename":"Sahasra", "job":"CEO", "salary":100000.00},
        {"empno":1002, "ename":"Venugopal", "job":"HR-Manager", "salary":200000.00},
        {"empno":1003, "ename":"Pravathi", "job":"Developer", "salary":300000.00}
    ];
    return(
        <div>
            <h1>This is DemoPage Component</h1>
            <ol type="1" style={{textAlign:"left"}}>
            {
                cityinfo.map((city)=>(
                    <li>{city}</li>
                ))
            }
            </ol>

            <hr />
            
            <table width="100%" border="1">
                <tr>
                    <th>Emp No</th>
                    <th>Emp Name</th>
                    <th>Emp Job</th>
                    <th>Emp Sal</th>
                </tr>
                {
                    empinfo.map((emp)=>(
                        <tr>
                            <td>{emp.empno}</td>
                            <td>{emp.ename}</td>
                            <td>{emp.job}</td>
                            <td>{emp.salary}</td>
                        </tr>
                    ))
                }
            </table>
        </div>
    );
}

export default DemoPage;