import React, {Component} from 'react'
import MainPage from '../pages/MainPage'
import JobCard from './JobCard'

class App extends Component {
  render () {
    return (
      <div className='center'>
        <MainPage name='Mango'/>
        <JobCard children='text inside border'/>
      </div>
    )
  }
}

export default App
