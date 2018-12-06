import UserPaymentsService from '../../service/userPayments/UserPaymentsService.js';

const state = {
    userPayments: [],
    userPaymentSelected: ''
};

/* Set the userPayments, userPaymentSelected accordingly */
const mutations = {
    'SET_PAYMENTS' (state,payments) {
        state.userPayments = payments;
    },
    'ADD_PAYMENT' (state, payment) {
        console.log(payment);
        state.userPayments.push({
            payment
        })
    },
    'SET_PAYMENT_SELECTED'(state,id){
        const record = state.userPayments.find(element => element.id === id).id;
        state.userPaymentSelected = record;
        console.log('state.userPaymentSelected: ' + state.userPaymentSelected);
    },

    'DELETE_PAYMENT' (state){
        const record = state.userPayments.find(element => element.id === state.userPaymentSelected.id);
        state.userPayments.splice(state.userPayments.indexOf(record), 1);
        state.userPaymentSelected = '';
    }
};


/* Set the userPayments, userPaymentSelected by calling the REST API-s */
const actions = {
    initPayments: ({commit, getters}) => {
        UserPaymentsService.getUserPayments(getters.userLoggedIn.id)
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_PAYMENTS', response.data);
                }
            });
    },
    addPayment({commit}, payment) {
        UserPaymentsService.postUserPayment(payment);
        commit('ADD_PAYMENT', payment);
    },

    deletePayment({commit}){
        console.log('Deleting the: ' +  state.userPaymentSelected);
        UserPaymentsService.deleteUserPayment(state.userPaymentSelected).then(res => {
            console.log(res);
            commit('DELETE_PAYMENT');
        });
    },

    paymentSelected({commit}, id){
        commit('SET_PAYMENT_SELECTED', id);
    }
};

/* Allow accees to  the user payments */
const getters = {
    userPayments: state => {
        return state.userPayments;
    }
};

export default {
    state,
    mutations,
    actions,
    getters
}