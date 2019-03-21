import React from 'react'
import {shallow} from 'enzyme'
import Button from '.'

describe('Button component', () => {
  it('Should render correctly with no props', () => {
    const component = shallow(<Button/>)

    expect(component).toMatchSnapshot()
  })

  it('Testing "attrs.href = true" prop', () => {
    const component = shallow(<Button href={true} />)
    expect(component).toMatchSnapshot()
  })

  it('Testing "attrs.href = false" prop', () => {
    const component = shallow(<Button href={false} />)
    expect(component).toMatchSnapshot()
  })
})
