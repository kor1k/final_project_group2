import React from 'react'
import PropTypes from 'prop-types'
import classNames from 'classnames'

import './Button.css'

const Button = ({children, onClick, className, disabled, active, name, ...attrs}) => {
  const onClickAction = e => {
    if (disabled) {
      e.preventDefault()
    } else {
      return onClick(e)
    }
  }

  const classes = classNames(
    'btn',
    className,
    {active}
  )

  const Tag = attrs.href ? 'a' : 'button'

  return (
    <Tag
      className={classes}
      disabled={disabled}
      onClick={onClickAction}
      name={name}
      {...attrs}
    >
      {children}
    </Tag>
  )
}

Button.propTypes = {
  children: PropTypes.node,
  onClick: PropTypes.func,
  className: PropTypes.string,
  disabled: PropTypes.bool,
  active: PropTypes.bool
}

Button.defaultProps = {
  children: 'text here',
  onClick: () => {
  },
  className: '',
  disabled: false,
  active: false
}

export default Button