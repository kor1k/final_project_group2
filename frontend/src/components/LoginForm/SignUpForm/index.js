import React, {Component} from 'react'
import { Field, reduxForm} from 'redux-form'
import { NavLink } from "react-router-dom";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faUser } from '@fortawesome/free-solid-svg-icons'
import { faEnvelope } from '@fortawesome/free-solid-svg-icons'
import { faMapMarker } from '@fortawesome/free-solid-svg-icons'
import './SignUpForm.scss'

library.add(faUser);
library.add(faEnvelope);
library.add(faMapMarker);

class SignUpForm extends Component{
    render(){

        const { handleSubmit } = this.props
        return(
            <form className='form' onSubmit={ this.handleSubmit }>
                <div className="form-container">
                    <div className='form-fields signup'>
                        Sign up
                    </div>
                    <div className='form-fields text'>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua
                    </div>
                    <div className='form-fields fullname'>
                        <span><FontAwesomeIcon  className='form-fields icon' icon="user" /></span>
                        <Field name='fullname' placeholder="Full Name" component='input'/>
                    </div>
                    <div className='form-fields email'>
                        {/*<span><FontAwesomeIcon className='form-fields icon' icon="envelope" /></span>*/}
                        <Field name='email' placeholder="Email" component='input'/>
                    </div>
                    <div className='form-fields location'>
                        {/*<span><FontAwesomeIcon className='form-fields icon' icon="map-marker"/></span>*/}
                        <Field name='location' placeholder="Location" component='input'/>
                    </div>
                    <div className='form-fields checkbox-agree' >
                        <Field name='checkAgreement' component='input' type='checkbox'/>
                        I agree to the <span>Terms & Privacy</span>
                    </div>
                    <div className='form-fields btn-submit'>
                        <input type='submit' className='btn-submit__getstarted' value='GET STARTED'/>
                    </div>
                    <div className='form-fields link'>
                        <NavLink to='/register'>Have an account? <span>Sign in</span></NavLink>
                    </div>
                </div>
            </form>
        )
    }
}

SignUpForm = reduxForm({
    form:'contact'
})(SignUpForm)

export default SignUpForm

