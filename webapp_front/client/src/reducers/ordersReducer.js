import {
    ORDERS_LOADING,
    GET_ALL,
    SPECIFY_TIME
    // CREATE_NEW
  } from "../actions/types";
  
  const initialState = {
    activeOrders: [],
    newOrder: {},
    creatingOrder: false,
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
      case SPECIFY_TIME:
        return {
          ...state,
          clientTime: action.payload,
        };
      // case CREATE_NEW:
      //   return {
      //     ...state,
      //     // activeOrders: state.activeOrders.concat(action.payload),
      //     newOrder: action.payload,
      //     creatingOrder: true,
      //     loading: false
      //   };
      default:
        return state;
    }
  }
  