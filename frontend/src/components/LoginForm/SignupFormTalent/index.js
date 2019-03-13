import React, {Component} from 'react'
import { Field, reduxForm} from 'redux-form'
import {Link} from "react-router-dom";

import { FormInput } from "../../FormInput";
import { ButtonGetStarted } from "../../ButtonFormSubmit/ButtonGetStarted";

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import * as icon from '../../fontawesomeicom/importicon'

class SignupFormTalent extends Component{
    render(){

        const { handleSubmit } = this.props
        return(
            <form className='form' onSubmit={ handleSubmit }>
                <div className="form-container">
                    <div className='form-header'>
                        {/*{this.props.title}*/}
                        <h1>Sign up</h1>
                    </div>
                    <p className='form-text'>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua
                    </p>
                    <div className='form-fields fullname'>
                        <span><FontAwesomeIcon  className='form-fields icon' icon="user" /></span>
                        <Field name='fullname' type='text' placeholder="Full Name" component={FormInput}/>
                    </div>
                    <div className='form-fields email'>
                        <span><FontAwesomeIcon className='form-fields icon' icon="envelope" /></span>
                        <Field name='email' type='email' placeholder="Email" component={FormInput}/>
                    </div>
                    <div className='form-fields location'>
                        <span><FontAwesomeIcon type='text' className='form-fields icon' icon="map-marker-alt"/></span>
                        <Field name='location' placeholder="Location" component={FormInput}/>
                    </div>
                    <div className='form-fields checkbox-agree' >
                        <Field name='checkAgreement'  component='input' type='checkbox'/>
                        I agree to the <span>Terms & Privacy</span>
                    </div>
                    <div className='form-fields btn-submit'>
                        <ButtonGetStarted type='submit'/>
                    </div>
                    <div className='form-fields link'>
                        <Link to='/register'>Have an account? <span>Sign in</span></Link>
                    </div>
                </div>

            </form>
        )
    }
}

SignupFormTalent = reduxForm({
    form:'signuptalent',
    // validate
})(SignupFormTalent)

export default SignupFormTalent