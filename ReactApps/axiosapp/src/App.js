import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import EmpReg from './EmpReg';
import NavBar from './NavBar';
import ViewAllEmps from './ViewAllEmps';
import ModifyEmp from './ModifyEmp';
import Login from './Login';
import EmpHome from './EmpHome';

function App() {
  return (
    <div className="App">

<BrowserRouter>
      <NavBar />
      <Routes>        
        <Route path="/" exact Component={Login} />
        <Route path="/login" exact Component={Login} />
        <Route path="/viewall" exact Component={ViewAllEmps} />
        <Route path="/empreg" exact Component={EmpReg} />
        <Route path="/empmod/:id" exact Component={ModifyEmp} />
        <Route path="/wemp/:id" exact Component={EmpHome} />
      </Routes>
</BrowserRouter>
    </div>
  );
}

export default App;
