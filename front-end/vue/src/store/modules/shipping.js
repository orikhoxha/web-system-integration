import userShippingService from '../../service/userShipping/userShippingService.js';

const state = {
    userShipping: [],
    userShippingSelected: ''
};

const mutations = {
    'SET_SHIPPINGS' (state,shippings) {
        state.userShipping = shippings;
    },
    'ADD_SHIPPING' (state, shipping) {
        console.log(shipping);
        state.userShipping.push({
            shipping
        })
    },
    'SET_SHIPPING_SELECTED'(state,id){
        const record = state.userShipping.find(element => element.id === id).id;
        state.userShippingSelected = record;
        console.log('state.userShippingelected: ' + state.userShippingSelected);
    },

    'DELETE_SHIPPING' (state){
        const record = state.userShipping.find(element => element.id === state.userShippingSelected.id);
        state.userShipping.splice(state.userShipping.indexOf(record), 1);
        state.userShippingSelected = '';
    }
};

const actions = {
    initShippings: ({commit}) => {
        userShippingService.getUserShippings()
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_SHIPPINGS', response.data);
                }
            });
    },
    addShipping({commit}, shipping) {
        userShippingService.postUserShipping(shipping);
        commit('ADD_SHIPPING', shipping);
    },

    deleteShipping({commit}){
        console.log('Deleting the: ' +  state.userShippingSelected);
        userShippingService.deleteUserShipping(state.userShippingSelected).then(res => {
            console.log(res);
            commit('DELETE_SHIPPING');
        });
    },

    shippingSelected({commit}, id){
        commit('SET_SHIPPING_SELECTED', id);
    }
};

const getters = {
    userShippings: state => {
        return state.userShipping;
    }
};

export default {
    state,
    mutations,
    actions,
    getters
}