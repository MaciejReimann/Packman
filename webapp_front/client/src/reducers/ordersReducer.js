import {
    ORDERS_LOADING,
    GET_ALL,
    CREATE_NEW
  } from "../actions/types";
  
  const initialState = {
    activeOrders: [],
    creatingOrder: null,
    loading: false
  };
  
  export default function(state = initialState, action) {
    switch (action.type) {
      case ORDERS_LOADING:
      return {
        ...state,
        loading: true
      };
      case GET_ALL:
        return {
          ...state,
          activeOrders: action.payload,
          loading: false
        };
      case CREATE_NEW:
        return {
          ...state,
          activeOrders: state.activeOrders.concat(action.payload),
          loading: false
        };
      default:
        return state;
    }
  }
  