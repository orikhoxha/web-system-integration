import UserPaymentsService from '../../service/userPayments/UserPaymentsService.js';

const state = {
    userPayments: []
};

const mutations = {
    'SET_PAYMENTS' (state,payments) {
        state.userPayments = payments;
    },
    'ADD_PAYMENT' (state, payment) {
        state.userPayments.push({
            payment
        })
    },
    'DELETE_PAYMENT' (state, {id}){
        const record = state.items.find(element => element.id === id);
        state.userPayments.splice(state.userPayments.indexOf(record), 1);
    }
};

const actions = {
    initPayments: ({commit}) => {
        UserPaymentsService.getUserPayments()
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_PAYMENTS', response.data);
                }
            });
    },
    addPayment({commit}, payment) {
        UserPaymentsService.postUserPayment(payment);
        commit('ADD_PAYMENT', payment);
    }
};

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