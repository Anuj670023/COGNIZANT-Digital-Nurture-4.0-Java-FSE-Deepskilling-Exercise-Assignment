import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0); // Initial value of counter is 0

  const handleIncrement = () => {
    setCount(prevCount => prevCount + 1);
  };

  const handleDecrement = () => {
    setCount(prevCount => prevCount - 1);
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h2>Counter Value: {count}</h2>
      <button onClick={handleIncrement} style={{ marginRight: '10px',  padding :'2px' , borderRadius :'4px'}}>Increment</button>
      <button onClick={handleDecrement} style={{ marginRight: '10px',padding :'2px' , borderRadius :'4px' }}>Decrement</button>
    </div>
  );
}

export default Counter;
