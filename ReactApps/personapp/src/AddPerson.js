import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
function AddPerson()
{
    const navigate = useNavigate();
    const [pinfo, setPinfo] = useState({
        "pid":0,
        "pname":"",
        "email":"",
        "phone":""  
    })

    const addPerson =(e) =>{
        e.preventDefault();

            axios.post('http://localhost:9087/person', pinfo).then(response=>{
                console.log(response.data);
                console.log(response.status);
                console.log(response.statusText);

                //alert(response.statusText);
                navigate('/viewall');
            })        
    }

    return(
        <div>
            <div className="row">
                <div className="col-md-3"></div>
                <div className="col-md-6">
                    <div className="card">
                        <div className="card-header">Person Registration</div>
                        <div className="card-body">
                            <form name="frmReg" method="POST" onSubmit={addPerson}>
                            <label>Person Name</label>
                            <input type="text" 
                            name="pname" 
                            className="form-control"
                            onChange={(e)=>{setPinfo({...pinfo,pname:e.target.value})}} />

                            <label>Person Email</label>
                            <input type="text" name="email" 
                            className="form-control" 
                            onChange={(e)=>{setPinfo({...pinfo,email:e.target.value})}} />

                            <label>Person Phone</label>
                            <input type="text" name="phone" 
                            className="form-control" 
                            onChange={(e)=>{setPinfo({...pinfo,phone:e.target.value})}}/>
                            <br /><br />
                            <input type="submit" value="Add Person" className="btn btn-success"/>
                            </form>
                        </div>
                    </div>
                </div>
                <div className="col-md-3"></div>
            </div>
        </div>
    );
}
export default AddPerson;