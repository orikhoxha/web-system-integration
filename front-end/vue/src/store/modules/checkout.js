import CheckoutService from '../../service/checkout/CheckoutService.js';

const state = {
    date: {},
    time: {},
    shippingAddress: {},
    checkoutPayment: {}
};

/* Set the date, time, shippingAddress, checkoutPayment accordingly */
const mutations = {
    'SET_DATE' (state,date) {
        state.date = date;
        console.log("THe date is set: " + state.date.dayInt);
    },
    'SET_TIME' (state,time) {
        state.time = time;
        console.log("THe time is set: " + state.time);
    },
    'SET_SHIPPING_ADDRESS' (state,shippingAddress) {
        console.log(shippingAddress);
        state.shippingAddress = shippingAddress;
    },
    'SET_CHECKOUT_PAYMENT' (state,payment) {
        state.checkoutPayment = payment;
        console.log("THe payment is set: " + state.checkoutPayment);
    },
    'CHECKOUT_ORDER' (state,checkout) {
        CheckoutService.postCheckout(checkout)
    }

};


/* Set the date, time, shippingAddress, checkoutPayment by calling the REST API-s */
const actions = {
    setDate({commit}, date) {
        commit('SET_DATE', date);
    },

    setTime({commit}, time) {
        commit('SET_TIME', time);
    },
    setShippingAddress({commit}, shippingAddress) {
        commit('SET_SHIPPING_ADDRESS', shippingAddress);
    },
    setCheckoutPayment({commit}, payment) {
        commit('SET_CHECKOUT_PAYMENT', payment);
    },

    checkoutOrder({commit}, checkout){
        commit('CHECKOUT_ORDER', checkout)
    }
};


/* Allow accees to  the date, time, shippingAddress, checkoutPayment */
const getters = {
    checkoutDate: state => {
        return state.date;
    },

    checkoutTime: state => {
        return state.time;
    },

    checkoutShippingAddress: state => {
        return state.shippingAddress;
    },

    checkoutPayment: state => {
        return state.checkoutPayment;
    },
};

export default {
    state,
    mutations,
    actions,
    getters
}