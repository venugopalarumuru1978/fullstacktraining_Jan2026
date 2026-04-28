import { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";
function ModifyPerson()
{
    const navigate = useNavigate();
    const {pid} = useParams();
    const [pinfo, setPinfo] = useState({});


    useEffect(()=>{
        axios({
            url: "http://localhost:9087/person/" + pid,
            method: "GET",
            data: pinfo,
        })
        .then((res) =>{
            setPinfo(res.data);
            console.log(res.data);
        })
        .catch((res)=>{
            alert("Not Found....")
        });
    },[]);
    const ModifyPerson =(e) =>{
        e.preventDefault();

            axios.put('http://localhost:9087/person/' + pid, pinfo)
            .then(response=>{
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
                            <form name="frmUpdate" method="POST" onSubmit={ModifyPerson}>
                            <label>Person Name</label>
                            <input type="text" 
                            name="pname" 
                            className="form-control" value={pinfo.pname}
                            onChange={(e)=>{setPinfo({...pinfo,pname:e.target.value})}} />

                            <label>Person Email</label>
                            <input type="text" name="email" 
                            className="form-control"  value={pinfo.email}
                            onChange={(e)=>{setPinfo({...pinfo,email:e.target.value})}} />

                            <label>Person Phone</label>
                            <input type="text" name="phone" 
                            className="form-control" value={pinfo.phone}
                            onChange={(e)=>{setPinfo({...pinfo,phone:e.target.value})}}/>
                            <br /><br />
                            <input type="submit" value="Update Person" className="btn btn-success"/>
                            </form>
                        </div>
                    </div>
                </div>
                <div className="col-md-3"></div>
            </div>
        </div>
    );
}
export default ModifyPerson;