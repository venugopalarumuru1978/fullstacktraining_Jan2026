import { useState } from 'react';
import './App.css';
import Test1 from './Test1';
import SampleForm from './SampleForm';
import SampleJsonForm from './SampleJsonForm';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import NavBar from './NavBar';
import Sample from './Sample';
import Login from './Login';
import Welcome from './Welcome';

function App() {


  return (
    <div>

<BrowserRouter>
      <NavBar />
      <Routes>        
        <Route path="/pg1" exact Component={SampleForm} />
        <Route path="/pg2" exact Component={SampleJsonForm} />
        <Route path="/pg3" exact Component={Sample} />
        <Route path="/login" exact Component={Login} />
        <Route path="/welcome" exact Component={Welcome} />
      </Routes>
</BrowserRouter>
      
    </div>
  );
}

export default App;
