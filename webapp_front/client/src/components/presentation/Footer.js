import React from 'react';
import { Link } from 'react-router-dom';

const Footer = () => {
    return (
      <footer className="footer">
        <div className="items">
          <Link to="https://www.dbschenker.com/global/meta/legal">
            <div>Legal</div>
          </Link>
          <Link to="https://www.dbschenker.com/global/meta/privacy-policy">
            <div>Privacy Policy</div>
          </Link><Link to="https://www.dbschenker.com/global/meta/terms-and-conditions">
            <div>Terms and Conditions</div>
          </Link>
        </div>
      </footer>
    )
  }
  
  export default Footer;  