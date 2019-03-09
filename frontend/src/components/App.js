import React, { Component } from 'react'

import MainPage from '../pages/MainPage'

class App extends Component {
  render () {
    return (
      <div className='center'>
        {/* Only for example, delete anywhere */}
        <MainPage name='Mango' />
      </div>
    )
  }
}

export default App
