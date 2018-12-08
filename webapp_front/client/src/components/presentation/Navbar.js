import React from 'react';
import { Link } from 'react-router-dom';
import { connect } from 'react-redux';
import { 
    getAllOrders 
} from '../../actions/ordersActions';

const Navbar = ({ getAllOrders }) => {
    return (
        <nav className="navbar navbar-border">
            <div className="logo">
                <a href="https://www.dbschenker.com/global">
                    <img src="logos/db-logo.svg"></img>
                </a>
            </div>
            <div className="search">
                <input>
                </input>
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