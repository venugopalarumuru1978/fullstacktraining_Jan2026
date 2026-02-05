import './App.css';
import { createContext, useState } from 'react';
import CompA from './Components/CompA';
import CompB from './Components/CompB';

export const onlineStore = createContext();

function App() {
  const [shop, setShop] = useState([
    {
      brandName:"Nokia", stock:30
    },
    {
      brandName:"Samsung", stock:40
    },
    {
      brandName:"OnePlus", stock:10
    }
  ]);

  return (
    <div className="App">
      <onlineStore.Provider value={[shop, setShop]}>
       <CompA />
       <CompB />
      </onlineStore.Provider>
    </div>
  );
}

export default App;
