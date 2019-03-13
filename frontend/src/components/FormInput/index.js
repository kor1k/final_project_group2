import React from 'react'
import './FormInput.scss'

export const FormInput = props => {
    return (
        <input className ='form-input' {...props.input} type = {props.type} placeholder={props.placeholder}/>
    )
}
