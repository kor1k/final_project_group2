import React from 'react'
import './ButtonSignIn.scss'

export const ButtonSignIn = props => {
    return (
        <button className='form-submit' type = {props.type}>Sign in</button>
    )
}