import React from 'react'
import {shallow} from 'enzyme'
import App from './App'

describe('App component', () => {
  it('Should render correctly with no props', () => {
    const component = shallow(<App/>)

    expect(component).toMatchSnapshot()
  })
})
