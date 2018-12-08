import React from 'react';

import OrderCard from './OrderCard'

const Dashboard = ({ activeOrders }) => {
    const activeOrdersCards = activeOrders
        .map((order, id) => <OrderCard order={order} key={id}/>);
    return (
        <div className = "dashboard">
            {activeOrdersCards}
            {/* <div className = "container">
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
            </div> */}
        </div>
    )
}

export default Dashboard;