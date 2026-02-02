import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import EmpReg from './EmpReg';
import NavBar from './NavBar';
import ViewAllEmps from './ViewAllEmps';
import ModifyEmp from './ModifyEmp';

function App() {
  return (
    <div className="App">

<BrowserRouter>
      <NavBar />
      <Routes>        
        <Route path="/" exact Component={ViewAllEmps} />
        <Route path="/viewall" exact Component={ViewAllEmps} />
        <Route path="/empreg" exact Component={EmpReg} />
        <Route path="/empmod/:id" exact Component={ModifyEmp} />
      </Routes>
</BrowserRouter>
    </div>
  );
}

export default App;
