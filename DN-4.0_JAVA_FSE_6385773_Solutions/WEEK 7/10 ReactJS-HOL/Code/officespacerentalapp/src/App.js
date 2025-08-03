import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai", img: "image.png" },
    { Name: "WeWork", Rent: 65000, Address: "Bangalore", img: "office.png" },
    { Name: "Regus", Rent: 45000, Address: "Hyderabad", img: "office2.png" }
  ];

  return (
    <div className="App">
      <h1>{element} , at Affordable Range</h1>

      {officeList.map((item, index) => {
        const colorClass = item.Rent <= 60000 ? 'textRed' : 'textGreen';

        return (
          <div key={index} style={{ marginBottom: '40px' }}>
            <img src={item.img} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {item.Name}</h1>
            <h3 className={colorClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
