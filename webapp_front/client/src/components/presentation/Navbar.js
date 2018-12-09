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
                <div className="icons">
                    <i className="fas fa-search"></i>
                    <i className="fas fa-bars"></i>
                </div>
                {/* <div className="search">
                    
                </div>                 */}
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