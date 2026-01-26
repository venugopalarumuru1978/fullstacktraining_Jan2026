
import About from './About';
import './App.css';
import DemoPage from './DemoPage';
import { BrowserRouter, Route } from 'react-router-dom';
import { Routes } from 'react-router';
import Home from './Home';
import Navbar from './Navbar';

function App() {
  return (
    <div className='App'>
      <img src='slide-2.jpg'  height="200px" width="100%" alt='Not an Image' />
      <BrowserRouter>
      <Navbar />
      <hr />
        <Routes>
          <Route path="/" exact Component={Home} />
          <Route path="/home" exact Component={Home} />
          <Route path="/dpage" exact Component={DemoPage} />
          <Route path="/about" exact Component={About} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
