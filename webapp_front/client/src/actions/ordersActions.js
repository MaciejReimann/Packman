import axios from "axios";

import {
    // ORDERS_LOADING,
    GET_ALL,
    // CREATE_NEW
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
export const createNew = () => dispatch => {
    // dispatch(setProfileLoading());
    // axios
    //   .get("/api/profile")
    //   .then(res =>
    //     dispatch({
    //       type: GET_ALL,
    //       payload: res.data
    //     })
    //   )
    //   .catch(err =>
    //     dispatch({
    //       type: GET_ALL,
    //       payload: {}
    //     })
    //   );
  };