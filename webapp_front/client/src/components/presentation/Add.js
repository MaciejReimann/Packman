import React from 'react';
import { Link } from 'react-router-dom';

import '../../Add.css';

const Add = () => {
    return (
        <Link to="/add">
            <div className = "add">
                <button>
                <i className="fas fa-plus"></i>
                </button>
            </div>
        </Link>        
    )
  }
  
  export default Add; 


        