import React from 'react'
import classNames from 'classnames'

import './JobCard.scss'

const JobCard = ({children, disabled, onClick, className, active, name, ...attrs}) => {
  const onClickAction = e => {
    if (disabled) {
      e.preventDefault()
    } else {
      return onClick(e)
    }
  }

  const classes = classNames(
    'card',
    className,
    {active}
  )

  const CardTag = attrs.href ? 'a' : 'card'

  return (
    <CardTag
      className={classes}
      disabled={disabled}
      onClick={onClickAction}
      name={name}
      {...attrs}
    >{children}
    </CardTag>
  )
}

export default JobCard