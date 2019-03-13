import React, { Component } from 'react'

import MainPage from '../pages/MainPage'
import LoginForm from "./LoginForm";
import { BrowserRouter as Route, Router } from 'react-router-dom'

class App extends Component {
  render () {
    return (
      <Router>
        <div className='center'>
          {/* Only for example, delete anywhere */}
          <Route path='/' component={MainPage} />
          <Route path='/singup' component={LoginForm}/>
        </div>
      </Router>
    )
  }
}

export default App
