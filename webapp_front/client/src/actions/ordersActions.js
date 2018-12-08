import axios from "axios";

import {
    // ORDERS_LOADING,
    GET_ALL,
    SPECIFY_TIME,
    CREATE_NEW
} from "./types";

// Get all active orders
export const getAllOrders = () => dispatch => {
    // dispatch(setProfileLoading());
    axios
      .get("http://77.55.234.86:8090/api/package/JN")
      .then(res =>
        dispatch({
          type: GET_ALL,
          payload: res.data
        })
      )
      .catch(err =>
        dispatch({
          type: GET_ALL,
          payload: {}
        })
      );
  };

// Create new order 


export const specifyTime = data => dispatch => {
  fetch( "http://77.55.234.86:8090/api/client/updateDates/JN", {
    method: 'POST', // or 'PUT'
    body: JSON.stringify(data), // data can be `string` or {object}!
    headers:{
      'Content-Type': 'application/json'
    }
  })
  .then(res => {
    console.log(res)
    return dispatch({
      type: SPECIFY_TIME,
      payload: res.data
    })
  })
  .catch(err =>
    dispatch({
      type: SPECIFY_TIME,
      payload: {}
    })
  );
};