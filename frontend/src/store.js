import { applyMiddleware, createStore } from 'redux'
import thunk from 'redux-thunk'
import rootReducer from './reducers'
import { composeWithDevTools } from 'redux-devtools-extension'

export const store = createStore(
  rootReducer, composeWithDevTools(
    applyMiddleware(thunk)
  ));

// Let's check the initial state of the store, it should be an empty object
// Output: {}
console.log('Redux initial state:');
console.log(JSON.stringify(store.getState()));
