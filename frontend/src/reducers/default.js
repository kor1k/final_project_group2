// Returns a state tree if the action is 'undefined'
// It is recommended to remove when there will be
// at least one working reducer.

const defaultReducer = (state = {}, action) => {
/*
  switch (action.type) {
    case TEST_ACTION:
      return {
        ...state,
        ...action.payload,
      };
    default:
      return state;
  }
*/
  return state
}

export default defaultReducer
