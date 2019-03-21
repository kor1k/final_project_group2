import React, {Component} from 'react'
import MainPage from '../pages/MainPage'
import Button from './Button'
import JobCard from './JobCard'

class App extends Component {
  render () {
    return (
      <div className='center'>
        <MainPage name='Mango'/>
        <div className='for__test__job-card'>
          <JobCard children='UX Designer'/>
          <JobCard children='Senior Data Scientist'/>
          <JobCard children='AR/VR Engineer'/>
        </div>
        <Button children='Find Jobs'/>
      </div>
    )
  }
}

export default App
