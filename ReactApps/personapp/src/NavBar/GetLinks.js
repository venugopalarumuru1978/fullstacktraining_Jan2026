import { BrowserRouter,  Route, Routes } from "react-router-dom";
import ViewPersons from "../ViewPersons";
import AddPerson from "../AddPerson";
import Links from "./Links";
import SearchPerson from "../SearchPerson";
import ModifyPerson from "../ModifyPerson";

function GetLinks()
{
    return(
        <div>
        <div className='row'>
          <div className='col-md-12'>
            <div className='card bg-info'>
              <div className='card-body centerinfo'>
          <BrowserRouter>   
          <Links />             
          <Routes>
            <Route path="/" exact Component={ViewPersons} />
            <Route path="/addperson" exact Component={AddPerson} />
            <Route path="/viewall" exact Component={ViewPersons} />
            <Route path="/search" exact Component={SearchPerson} />
            <Route path="/updatePerson/:pid"  exact Component={ModifyPerson} />          
          </Routes>
          </BrowserRouter>
              </div>
            </div>
          <br /><br />
          </div>
        </div>
        </div>
    );
}

export default GetLinks;