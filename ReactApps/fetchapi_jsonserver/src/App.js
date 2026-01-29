import { BrowserRouter, Route, Routes } from 'react-router-dom';
import AddStd from './AddStd';
import './App.css';
import GetStdData from './GetStdData';
import UpdateStd from './UpdateStd';

function App() {
  return (
    <div className="App">
       <BrowserRouter>
      <Routes>
        <Route path="/" exact Component={GetStdData} />
        <Route path="/allstds" exact Component={GetStdData} />
        <Route path="/newstd" exact Component={AddStd} />
        <Route path="/uptstd/:id" exact Component={UpdateStd} />
      </Routes>
      </BrowserRouter>      
    </div>
  );
}

export default App;
