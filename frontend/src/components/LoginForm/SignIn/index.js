import React, {Component} from 'react'
import { Field, reduxForm} from 'redux-form'
import { Link } from 'react-router-dom';

import { FormInput } from "../../FormInput";
import { ButtonSignIn } from "../../ButtonFormSubmit/ButtonSignIn";

// import { validate } from '../../validation'

import './SignInForm.scss'
import * as icon from '../../fontawesomeicom/importicon'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

class SignIn extends Component{
    render(){

        const { handleSubmit } = this.props
        return(
            <form className='form' onSubmit={ handleSubmit }>
                <div className="form-container">

                    <div className='form-header'>
                        <h1>Sign in</h1>
                    </div>
                    <div className='form-fields fullname'>
                        <span><FontAwesomeIcon  className='form-fields icon' icon="user" /></span>
                        <Field name='fullname' type='text' placeholder="Full Name" component={FormInput}/>
                    </div>
                    <div className='form-fields password'>
                        <span><FontAwesomeIcon className='form-fields icon' icon="key" /></span>
                        <Field name='password' type='password' placeholder="Password" component={FormInput}/>
                    </div>
                    <div className='form-fields checkbox-agree' >
                        <Field name='checkAgreement'  component='input' type='checkbox'/>
                        Remember me <span>Forgot password</span>
                    </div>
                    <div className='form-fields btn-submit'>
                        <ButtonSignIn type='submit'/>
                    </div>
                    <div className='form-fields link'>
                        <Link to='/register'>Have an account? <span>Sign in</span></Link>
                    </div>
                </div>

            </form>
        )
    }
}

SignIn = reduxForm({
    form:'contact',
    // validate
})(SignIn)

export default SignIn