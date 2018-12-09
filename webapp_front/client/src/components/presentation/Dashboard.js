import React from 'react';

import OrderCard from './OrderCard'

const Dashboard = ({ activeOrders }) => {
    const activeOrdersCards = activeOrders
        .map(order => <OrderCard order={order}/>);
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