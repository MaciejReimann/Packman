import React, { Component } from 'react';
import axios from 'axios';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      dbResponse: null,
      routeResponse: null,
      fetching: true
    };
  }

  componentDidMount() {
    axios
      .get('/api/items')
      .then(res => {
        const item = res.data[0].name;
        this.setState({
          dbResponse: item,
          fetching: false
        });
      })
      .catch(err => {
        console.log(err);
      });
    axios
      .get('/api/custom')
      .then(res => {
        this.setState({
          routeResponse: res.data.payload,
          fetching: false
        });
      })
      .catch(err => {
        console.log(err);
      });
  };

  render() {
    const dbIntro = this.state.fetching
      ? 'Fetching message from DB...'
      : this.state.dbResponse
    const routeIntro = this.state.fetching
      ? 'Fetching message from custom route...'
      : this.state.routeResponse
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React</h2>
        </div>
        <p className="App-intro">
          This is a custom route response:
        </p>
        <p className="api-response">
          {routeIntro}
        </p>        
        <p className="App-intro">
          This is a MongoDB response: 
        </p>
        <p className="api-response">
          {dbIntro}
        </p>
      </div>
    );
  }
}

export default App;
