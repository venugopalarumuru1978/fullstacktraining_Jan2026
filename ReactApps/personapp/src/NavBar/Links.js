import { Link } from "react-router-dom";

function Links()
{
    return(
        <div className="App">
        <Link to="/addperson" className="btn btn-success">New Person</Link>  &nbsp;&nbsp;&nbsp;&nbsp;
        <Link to="/viewall" className="btn btn-success">All Persons</Link> &nbsp;&nbsp;&nbsp;&nbsp;
        <Link to="/search" className="btn btn-success">Search Person</Link>  &nbsp;&nbsp;&nbsp;&nbsp;        
        <br /><br />
    </div>
    );
}

export default Links;