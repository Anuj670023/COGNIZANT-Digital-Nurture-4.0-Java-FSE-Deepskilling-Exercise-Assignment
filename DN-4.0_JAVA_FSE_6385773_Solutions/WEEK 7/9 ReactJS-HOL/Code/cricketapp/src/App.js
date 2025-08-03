import React, { useState } from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';
import FlagButton from './components/FlagButton';

function App() {

  const [isOn, setIsOn] = useState(false);

  return (
    <div>
      <h1>Cricket App</h1>
      <div style={{display:'flex'}}>

      <h2>flag : </h2><FlagButton isOn={isOn} toggleFlag={() => setIsOn(prev => !prev)} />
      </div>
      { isOn  ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;