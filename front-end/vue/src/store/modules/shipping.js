import userShippingService from '../../service/userShipping/userShippingService.js';

const state = {
    userShipping: [],
    userShippingSelected: ''
};


/* Set the userShipping, userShippingSelected accordingly */
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
        console.log("The record" + record);
        state.userShippingSelected = record;
        console.log('state.userShippingelected: ' + state.userShippingSelected);
    },

    'DELETE_SHIPPING' (state){
        const record = state.userShipping.find(element => element.id === state.userShippingSelected.id);
        state.userShipping.splice(state.userShipping.indexOf(record), 1);
        state.userShippingSelected = '';
    }
};

/* Set the shippings by calling the REST API-s */
const actions = {
    initShippings: ({commit, getters}) => {
        userShippingService.getUserShippings(getters.userLoggedIn.id)
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_SHIPPINGS', response.data);
                }
            });
    },
    addShipping({commit, getters}, shipping) {
        userShippingService.postUserShipping(shipping, getters.userLoggedIn.id);
        commit('ADD_SHIPPING', shipping);
    },

    deleteShipping({commit, getters}){
        console.log('Deleting the: ' +  state.userShippingSelected);
        userShippingService.deleteUserShipping(state.userShippingSelected, getters.userLoggedIn.id).then(res => {
            console.log(res);
            commit('DELETE_SHIPPING');
        });
    },

    shippingSelected({commit}, id){
        commit('SET_SHIPPING_SELECTED', id);
    }
};


/* Allow user shippings access */
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