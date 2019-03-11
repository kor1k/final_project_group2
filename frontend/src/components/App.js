import React, { Component } from 'react'

import MainPage from '../pages/MainPage'
import LoginForm from "./LoginForm";

class App extends Component {
  render () {
    return (
      <div className='center'>
        {/* Only for example, delete anywhere */}
        <MainPage name='Mango' />
        <LoginForm/>
      </div>
    )
  }
}

export default App
