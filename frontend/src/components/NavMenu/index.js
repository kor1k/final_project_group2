import React, {Component} from 'react'
import {NavLink} from "react-router-dom";
import './NavMenu.scss'

export default class NavMenu extends Component{
    render(){
        return(
            <div className='nav-menu'>
                <NavLink className='nav-menu__link' to = '/signin'>Sign in</NavLink>
                <NavLink className='nav-menu__link' to = '/talent'>Sign up Talent</NavLink>
                <NavLink className='nav-menu__link' to = '/company'>Sign up Company</NavLink>
            </div>
        )
    }
}