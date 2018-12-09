import React from 'react';

const OrderCard = ({ order }) => {
    return (
        <div className="card order">
            <div className="card-body row">
                <div className = "col parcelNo">
                    {order.parcelNo}
                </div>
                <div className = "col address">
                    {order.address}
                </div>
                <div className = "col deliveryTime">
                    {order.deliveryTime}
                </div>

            </div>
            {/* <div cl ssName = "row">
                <div className = "col-md-12">
                    {order.parcelNo}
                </div>
            </div>             */}
        </div>
    )
}

export default OrderCard;

