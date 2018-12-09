import React from 'react';

const orderToCard = order => {
    console.log(order)
    return (
        <div>
            {order.parcelNo}
        </div>
    )
}

const Dashboard = ({ activeOrders }) => {
    console.log( 
        activeOrders
    )
    const activeOrdersCards = activeOrders.map(order => orderToCard(order))
    return (
        <div className = "dashboard">
            <div className = "container">
                <div className = "row">
                    <div className = "col-md-12">
                        <h1 className = "display-4">
                            Dashboard
                        </h1>
                        <div>
                            {activeOrdersCards}
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Dashboard;