import React, { Component } from 'react';
import { connect } from 'react-redux';
import { 
    createNew 
} from '../../actions/ordersActions';

class formContainer extends Component {

    componentDidMount() {
        this.props.getAllOrders()
    }

    render() {
        return (
            <div className = "dashboard-container">
                {/* <Dashboard activeOrders={this.props.activeOrders}/> */}
            </div>
        )
    }    
}

const mapStateToProps = state => ({
    activeOrders: state.orders.createNew,
});


export default connect(
    mapStateToProps,
    {
        createNew
    }
    )(formContainer);