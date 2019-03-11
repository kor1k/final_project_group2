import React, { Component } from 'react'
import SignUpForm from './SignUpForm'

class LoginForm extends Component{

    submit = values =>{
        console.log(JSON.stringify(values))
    }

    render(){
        return(
            <div>
                <h1>LoginForm</h1>
                <SignUpForm onSubmit={this.submit} />
            </div>
        )
    }
}

export default LoginForm