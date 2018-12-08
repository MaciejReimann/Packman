import React, { Component } from 'react';
import { connect } from 'react-redux';
import { 
    getAllOrders 
} from '../../actions/ordersActions';

import Dashboard from '../presentation/Dashboard';

class dashboardContainer extends Component {

    componentDidMount() {
        this.props.getAllOrders()
    }

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

export default connect(
    mapStateToProps,
    {
        getAllOrders
    }
    )(dashboardContainer);
