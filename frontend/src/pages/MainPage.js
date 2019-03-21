import React, {Fragment} from 'react'
import PropTypes from 'prop-types'

const MainPage = props => {
  return (
    <Fragment>
      <h1 className='title'>Hello {props.name}</h1>
      <p className='content'>Hooray! Now everything works as expected.</p>
      <p className='title__job-roles'>Job Roles</p>
    </Fragment>
  )
}

// Read more about PropTypes
// https://reactjs.org/docs/typechecking-with-proptypes.html
MainPage.propTypes = {
  name: PropTypes.string
}

// Don't forget to set default props for components
MainPage.defaultProps = {
  name: 'React'
}

export default MainPage
