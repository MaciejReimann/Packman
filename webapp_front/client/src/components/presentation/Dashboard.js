import React from 'react';

import OrderCard from './OrderCard'

const Dashboard = ({ activeOrders }) => {
    const activeOrdersCards = activeOrders
        .map((order, id) => <OrderCard order={order} key={id}/>);
    return (
        <div className = "dashboard">
        <h2 className = "header">
            Shipment status
        </h2>
            {activeOrdersCards}
        </div>
    )
}

export default Dashboard;