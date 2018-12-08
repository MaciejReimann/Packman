import React from 'react';
import { Link } from 'react-router-dom';
import { connect } from 'react-redux';
import { 
    getAllOrders 
} from '../../actions/ordersActions';

const Navbar = ({ getAllOrders }) => {
    return (
        <nav className="navbar">
            <div className="items">
                <div className="logo">
                    <a href="https://www.dbschenker.com/global">
                        <img src="logos/db-logo.svg"></img>
                    </a>
                </div>
                <div className="search">
                    <i className="fas fa-search"></i>
                </div>
                <div className="search">
                <i class="fas fa-bars"></i>
                </div>                
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