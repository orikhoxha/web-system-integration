//import UserPaymentsService from '../../service/userPayments/UserPaymentsService.js';

const state = {
    date: {},
    time: {},
    shippingAddress: {},
    checkoutPayment: {}
};

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

   /* 'ADD_PAYMENT' (state, payment) {
        console.log(payment);
        state.userPayments.push({
            payment
        })
    },*/
   /* 'SET_PAYMENT_SELECTED'(state,id){
        const record = state.userPayments.find(element => element.id === id).id;
        state.userPaymentSelected = record;
        console.log('state.userPaymentSelected: ' + state.userPaymentSelected);
    },*/
    /*'DELETE_PAYMENT' (state){
        const record = state.userPayments.find(element => element.id === state.userPaymentSelected.id);
        state.userPayments.splice(state.userPayments.indexOf(record), 1);
        state.userPaymentSelected = '';
    }*/
};

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

   /* deletePayment({commit}){
        console.log('Deleting the: ' +  state.userPaymentSelected);
        UserPaymentsService.deleteUserPayment(state.userPaymentSelected).then(res => {
            console.log(res);
            commit('DELETE_PAYMENT');
        });
    },*/

    /*paymentSelected({commit}, id){
        commit('SET_PAYMENT_SELECTED', id);
    }*/
};

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