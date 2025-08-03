import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      person: null,
      loading: true,
    };
  }

  async componentDidMount() {
    const url = "https://api.randomuser.me/";
    const response = await fetch(url);
    const data = await response.json();
    this.setState({ person: data.results[0], loading: false });
    console.log(data.results[0]);
  }

  render() {
    if (this.state.loading) {
      return <h2>Loading...</h2>;
    }

    const { name, picture } = this.state.person;

    return (
      <div style={{
    display: 'flex',
    flexDirection : 'column', 
    justifyContent: 'center',
    alignItems: 'center',
    height: '100vh',
  }}>
        <h2>User Information</h2>
        <p><strong>Title:</strong> {name.title}</p>
        <p><strong>First Name:</strong> {name.first}</p>
        <img src={picture.large} alt="User" />
      </div>
    );
  }
}

export default Getuser;
