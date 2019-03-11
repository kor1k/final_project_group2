import { combineReducers } from 'redux'
import defaultReducer from './default'
import { reducer as formReducer } from 'redux-form'

// Use ES6 object literal shorthand syntax to define the object shape
const rootReducer = combineReducers({
    form: formReducer,
  defaultReducer
  // insert your reducers here
})

export default rootReducer
