// FlagButton.jsx
import React from 'react';

const FlagButton = ({ isOn, toggleFlag }) => {

  return (
    <button
      onClick={toggleFlag}
      style={{
        backgroundColor: isOn ? '#4caf50' : '#f44336', // Green when ON, Red when OFF
        color: 'white',
        border: 'none',
        padding: '2px 24px',
        fontSize: '16px',
        borderRadius: '8px',
        cursor: 'pointer',
        transition: 'background-color 0.3s ease',
      }}
    >
      {isOn ? 'ON' : 'OFF'}
    </button>
  );
};

export default FlagButton;
