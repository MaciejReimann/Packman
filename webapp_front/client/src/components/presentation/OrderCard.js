import React, { Component } from 'react';
import { connect } from 'react-redux';
import { 
    specifyTime 
} from '../../actions/ordersActions';

import '../../Card.css';

class OrderCard extends Component {
    constructor(props) {
        super(props);
        this.state = {
            clientTime: ''
        }
        this.onChange = this.onChange.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
    }

    onChange(e) {
        this.setState({ [e.target.name]: e.target.value });
    };

    onSubmit(e) {
        e.preventDefault();
        this.props.specifyTime(this.state.clientTime)
    };

    render() {
        const { order } = this.props;
        return (
            <div className="card">
                <div className="items">
                    <div className = "deliveryTime">
                        <form onSubmit={this.onSubmit} >
                            <input 
                                onChange={this.onChange}
                                name="clientTime"
                            >
                            </input>
                        </form>
                        
                    </div>
    
                    <div className = "parcelNo">
                        {order.parcelNo}
                    </div>
                    
                    <div className = "address">
                        {order.address}
                    </div>
                    
    
                </div>
            </div>
        )
    }  

}

export default connect(
        null,
        {
            specifyTime
        }
        )(OrderCard);

