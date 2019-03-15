import { SIGNUP_TALENT_FAILURE, SIGNUP_TALENT_REQUEST, SIGNUP_TALENT_SUCCESS } from '../actions/types'

const initialState = {
  isFetching: false
}

export const reducerTalent = (state = initialState, action) => {
  switch(action.type){
    case SIGNUP_TALENT_REQUEST:{
      return {
        isFetching: true
      }
    }
    case SIGNUP_TALENT_SUCCESS:{
      return{
        isFetching: false,
        // action.payload
      }
    }
    case SIGNUP_TALENT_FAILURE: {
      return {
        isFetching: false,
        error
      }
    }
  }
}