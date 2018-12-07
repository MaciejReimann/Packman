import React, { Component } from 'react';
import { connect } from 'react-redux';


import Dashboard from '../presentation/Dashboard';

class dashboardContainer extends Component {

    render() {
        return (
            <div className = "dashboard-container">
                <Dashboard activeOrders={this.props.activeOrders}/>
            </div>
        )
    }    
}

const mapStateToProps = state => ({
    activeOrders: state.orders.activeOrders,
});


export default connect(mapStateToProps)(dashboardContainer);
