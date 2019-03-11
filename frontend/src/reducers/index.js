import { combineReducers } from 'redux'
import defaultReducer from './default'

// Use ES6 object literal shorthand syntax to define the object shape
const rootReducer = combineReducers({
  defaultReducer
  // insert your reducers here
})

export default rootReducer
