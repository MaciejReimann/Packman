import React from 'react';

const Navbar = () => {
    return (
        <nav className="navbar">
            <div className="items">
                <div className="logo">
                    <a href="https://www.dbschenker.com/global">
                        <img src="logos/db-logo.svg" alt="db-logo"></img>
                    </a>
                </div>
                <div className="icons">
                    <i className="fas fa-search"></i>
                    <i className="fas fa-bars"></i>
                </div>
            </div>
        </nav>
    )
}

export default Navbar;