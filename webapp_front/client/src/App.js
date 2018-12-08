import React, { Component } from 'react';
import { 
  BrowserRouter as Router, 
  Route, 
  // Switch 
} from 'react-router-dom';

import { Provider } from 'react-redux';
import store from './store';

import Navbar from './components/presentation/Navbar';
import Footer from './components/presentation/Footer';
import dashboardContainer from './components/containers/dashboardContainer';

import './App.css';
import './Navbar.css';
import './Main.css';
import './Footer.css';


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
            <Navbar/>
            {/* <Route exact path='/' component={ Landing } /> */}
            <div className="main-container">
              {/* <Route exact path="/add" component={ AddOrder } /> */}
              <Route exact path="/dashboard" component={ dashboardContainer } />
            </div>
            <Footer/>
          </div>
        </Router>
      </Provider>
    )
  }
}

export default App;
