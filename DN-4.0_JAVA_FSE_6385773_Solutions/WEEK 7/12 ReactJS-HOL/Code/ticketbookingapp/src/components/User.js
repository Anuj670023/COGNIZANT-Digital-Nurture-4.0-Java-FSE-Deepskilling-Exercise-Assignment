function User({setIsLoggedIn}) {
    const handleLogout = () => {
    setIsLoggedIn(false);
  };
    return (
        <>
           <h1> Welcome Back : </h1>

           <button onClick={handleLogout}> Logout </button>
        </>
    ); 
}

export default User; 