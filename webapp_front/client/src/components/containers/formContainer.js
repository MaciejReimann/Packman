import React, { Component } from 'react';
import { connect } from 'react-redux';
import { 
    createNew 
} from '../../actions/ordersActions';
import TextFieldGroup from '../presentation/common/TextFieldGroup';

class formContainer extends Component {
    constructor(props) {
        super(props);
        this.state = {
          name: '',
          surname: '',
          company: '',
          street: '',
          number: '',
          flat: '',
          postalCode: '',
          location: '',
          country: '',
          phoneNumber: '',
          date: '',
          hour: '',
          errors: {}
        };
        this.onChange = this.onChange.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
    };

    onSubmit(e) {
        e.preventDefault();
    
        const profileData = {
          name: this.state.name,
          surname: this.state.surname,
          company: this.state.company,
          street: this.state.street,
          number: this.state.number,
          flat: this.state.flat,
          postalCode: this.state.postalCode,
          location: this.state.location,
          country: this.state.country,
          phoneNumber: this.state.phoneNumber,
          date: this.state.date,
          hour: this.state.hour,
          errors: this.state.errors
        };
    
        this.props.createProfile(profileData, this.props.history)
      };

    onChange(e) {
        this.setState({ [e.target.name]: e.target.value });
      };

    render() {
        return (
            <div className = "dashboard-container">
                 <TextFieldGroup
                    placeholder = "Name"
                    name = 'name'
                    value = {this.state.name}
                    onChange = {this.onChange}
                    //   error = {errors.company}
                    // info =
                    //     'Could be your own company or one that you work for'
                /> 
                <TextFieldGroup
                  placeholder = "Company"
                  name = 'company'
                  value = {this.state.company}
                  onChange = {this.onChange}
                //   error = {errors.company}
                //   info =
                //     'Could be your own company or one that you work for'
                /> 
            </div>
        )
    }    
}

const mapStateToProps = state => ({
    newOrder: state.orders.newOrder,
});

export default connect(
    mapStateToProps,
    {
        createNew
    }
    )(formContainer);