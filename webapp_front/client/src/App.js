import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import axios from 'axios';

import { Provider } from 'react-redux';
import store from './store';

import Dashboard from './components/dashboard/Dashboard';

import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      // dbResponse: null,
      // routeResponse: null,
      // fetching: true
    };
  }

  componentDidMount() {
  
  };

  render() {
    return (
      <Provider store={store}>
        <Router>
          <div className="App">
            {/* <Route exact path='/' component={ Landing } /> */}
            <div className="container">
              <Route exact path="/dashboard" component={ Dashboard } />
            </div>
          </div>
        </Router>
      </Provider>
    )
  }
}

export default App;
