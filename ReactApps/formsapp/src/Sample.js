import React, { useEffect, useState } from "react";

function Sample()
{
    const [x, setX] = useState(10);
    const [str, setStr] = useState('Lavanya');

    const [count, setCount] = useState(0);

    useEffect(() => {
        document.title = `You clicked ${count} times`;
    }, [count]);

    const increment = ()=>{
      setX(x+1);
    }

    const decrement = ()=>{
      setX(x-1);
    }
    return(
        <div>
            <h1>State Object</h1>
      <h2>X value is : {x}</h2>
      <input type='button'  value="Increment" onClick={increment} />
      <input type='button'  value="Decrement" onClick={decrement} />
      <h2>Name of Person : {str}</h2>
      <input type='button'  value="Change Name" onClick={()=>{setStr('Varun Kumar')}} />
      <hr />
      <input type="button"  value="Click Me" onClick={()=>{setCount(count+1)}} />
      <h1>{count}</h1>
        </div>
    );
}

export default Sample;