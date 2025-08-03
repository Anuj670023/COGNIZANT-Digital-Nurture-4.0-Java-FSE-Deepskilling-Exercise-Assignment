function Login({setIsLoggedIn}) {

    const handleLogin = () => {
    setIsLoggedIn(true);
    };

    return (
        <>
        <h1> Book your Ticket here : </h1>

        <button onClick={handleLogin}>  Login </button>
        </>
    ); 
}

export default Login ; 