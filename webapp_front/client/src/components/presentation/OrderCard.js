import React from 'react';

import '../../Card.css';

const OrderCard = ({ order }) => {
    return (
        <div className="card">
            <div className="items">
                <div className = "deliveryTime">
                    {order.deliveryTime}
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

export default OrderCard;

