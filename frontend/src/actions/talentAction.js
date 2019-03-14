import React from 'react'
import { history as createBrowserHistory } from 'history'  // --- for redirect on closePage---
import {SUGNUP_TALENT_REQUEST, SIGNUP_TALENT_SUCCESS, SIGNUP_TALENT_FAILURE} from './types'

export const userActions = {
  // signin,
  signup,
  // signout,
}

const sighup = (fullname, email, location, history) =>{
    return dispatch=>{
      dispatch({
        type: SUGNUP_TALENT_REQUEST
      })
       axios.post('http:/some_url_address_for_request_on_add_to_db', {
         fullname,
         email,
         location
       })
        .then(response => response.data)// some response from backend

         .then( data => {
           console.log(data);
           dispatch({
             type: SIGNUP_TALENT_SUCCESS,
             payload: data
           })
           history.push('/')
         })

       .catch(error =>{
         dispatch({
           type: SIGNUP_TALENT_FAILURE,
           error
         })
       })
    }
}