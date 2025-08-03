import React from "react"; 

function Welcome() {

    const Saywelcome = () => {
      alert('welcome to the  website'); 
  };

  const Clickme =()=>{
     alert('you clicked me why ??'); 
  };
    return(
        <div style={{padding:2 , }}>
          <div>
             <button onClick={Saywelcome}>Say Welcome</button>
            </div>
           <button onClick={Clickme}>click me </button>

        </div>
    ); 
}

export default Welcome; 