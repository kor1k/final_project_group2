import React, {Component} from 'react'
import Button from '../components/Button'
import MainPage from '../pages/MainPage'

class App extends Component {
  render () {
    return (
      <div className='center'>
        {/* Only for example, delete anywhere */}
        <MainPage name='Mango'/>
        <Button>sign in</Button>
        <Button>sign up</Button>
      </div>
    )
  }
}

export default App
