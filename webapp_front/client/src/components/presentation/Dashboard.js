import React, { Component } from 'react';

const dashboardContent = "packages display"

class Dashboard extends Component {

    render() {
        return (
            <div className = "dashboard">
                <div className = "container">
                    <div className = "row">
                        <div className = "col-md-12">
                            <h1 className = "display-4">
                                Dashboard
                            </h1>
                                {dashboardContent}
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Dashboard;