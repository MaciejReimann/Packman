import React from 'react';
import { Link } from 'react-router-dom';
import { connect } from 'react-redux';
import { 
    getAllOrders 
} from '../../actions/ordersActions';

const Navbar = ({ getAllOrders }) => {
    return (
        <nav className="navbar navbar-expand-sm navbar-dark bg-dark mb-4">
            <div className="container">
            <Link className="navbar-brand" to="/">DB Schenker</Link>
            <button onClick={getAllOrders}>Get All</button>
            </div>
        </nav>
    )
}

// const mapStateToProps = (state) => ({
//     auth: state.auth
// })

export default connect(
    null, 
    { 
        getAllOrders, 
    }
)(Navbar);