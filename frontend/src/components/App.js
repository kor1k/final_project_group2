import React, {Component} from 'react'
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'

import NavMenu from './NavMenu'
import MainPage from '../pages/MainPage'
import SignIn from './LoginForm/SignIn'
import SignupFormTalent from './LoginForm/SignupFormTalent'
import SignupFormCompany from './LoginForm/SignupFormCompany'

class App extends Component{
    render(){
        return(
            <div>
                <NavMenu/>
                <Switch>
                    <Route exact path='/' component = {MainPage}/>
                    <Route exact path='/signin' component = {SignIn}/>
                    <Route exact path='/talent' component = {SignupFormTalent}/>
                    <Route exact path='/company' component = {SignupFormCompany}/>
                    {/*<Route path='/**' component = {NotFoundPage}/>*/}
                </Switch>
            </div>
        )
    }
}

export default App;
