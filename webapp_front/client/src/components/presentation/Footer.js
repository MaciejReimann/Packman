import React from 'react';
import { Link } from 'react-router-dom';

const Footer = () => {
    return (
      <footer className="footer bg-dark text-white mt-5 p-4 text-center">
        <Link to="https://www.dbschenker.com/global/meta/legal">
          <div>
              Legal
          </div>
        </Link>
        
      </footer>
    )
  }
  
  export default Footer;  