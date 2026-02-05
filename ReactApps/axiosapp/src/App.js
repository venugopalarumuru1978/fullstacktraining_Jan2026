import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import EmpReg from './EmpReg';
import NavBar from './NavBar';
import ViewAllEmps from './ViewAllEmps';
import ModifyEmp from './ModifyEmp';
import Login from './Login';
import EmpHome from './EmpHome';
import { useState } from 'react';
import Logout from './Logout';
import ChangePassword from './ChangePassword';
import NavBarEmp from './NavBarEmp';

function App() {
  const [loginStatus, setLoginStatus] = useState('')

  return (
    <div className="App">

<BrowserRouter>
      {
        loginStatus==='admin' ? (<NavBar />) : (loginStatus==='user')?(<NavBarEmp />) : ("")
      }
      
      <Routes>        
        <Route path="/" element={<Login setLoginStatus={setLoginStatus}></Login>} />
        <Route path="/login" element={<Login setLoginStatus={setLoginStatus}></Login>} />
        <Route path="/logout" element={<Logout setLoginStatus={setLoginStatus}></Logout>} />
        <Route path="/viewall" exact Component={ViewAllEmps} />
        <Route path="/empreg" exact Component={EmpReg} />
        <Route path="/empmod/:id" exact Component={ModifyEmp} />
        <Route path="/wemp/:id" exact Component={EmpHome} />
        <Route path="/cpwd" exact Component={ChangePassword} />
      </Routes>
</BrowserRouter>
    </div>
  );
}

export default App;
