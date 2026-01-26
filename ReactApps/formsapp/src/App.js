import { useState } from 'react';
import './App.css';
import Test1 from './Test1';
import SampleForm from './SampleForm';
import SampleJsonForm from './SampleJsonForm';

function App() {
    const [x, setX] = useState(10);
    const [str, setStr] = useState('Lavanya');

    let loc = "Amaravathi";

    const increment = ()=>{
      setX(x+1);
    }

    const decrement = ()=>{
      setX(x-1);
    }
  return (
    <div className="App">
      <table width="100%" border={1}>
        <tr>
          <td>
          <h1>State Object</h1>
      <h2>X value is : {x}</h2>
      <input type='button'  value="Increment" onClick={increment} />
      <input type='button'  value="Decrement" onClick={decrement} />
      <h2>Name of Person : {str}</h2>
      <input type='button'  value="Change Name" onClick={()=>{setStr('Varun Kumar')}} />
          </td>
          <td>
          <Test1 sname="Praveen" age="30" location={loc} />
          </td>
        </tr>
        <tr>
          <td>
            <SampleForm />
          </td>
          <td>
            <SampleJsonForm />
          </td>
        </tr>
      </table>
      <hr />
      
    </div>
  );
}

export default App;
