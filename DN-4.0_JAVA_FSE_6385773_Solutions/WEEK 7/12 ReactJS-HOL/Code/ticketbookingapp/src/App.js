import React, { useState } from 'react';

import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import './App.css';

import Login from "./components/Login"
import User from "./components/User"

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);
  return (
    <div className="App">
      <Router>
      <Routes>
        <Route
          path="/"
          element={
            isLoggedIn ? <Navigate to="/user" /> : <Login setIsLoggedIn={setIsLoggedIn} />
          }
        />
        <Route
          path="/user"
          element={
            isLoggedIn ? <User setIsLoggedIn={setIsLoggedIn} /> : <Navigate to="/" />
          }
        />
      </Routes>
    </Router>
    </div>
  );
}

export default App;
