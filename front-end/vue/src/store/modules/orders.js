import UserOrdersService from '../../service/userOrders/UserOrdersService.js';

const state = {
    userOrders: [],
};

/* Set the userOrders accordingly */
const mutations = {
    'SET_ORDERS' (state,orders) {
        state.userOrders = orders;
    },
};


/* Set the user orders by calling the REST API-s */
const actions = {
    initOrders: ({commit, getters}) => {
        UserOrdersService.getUserOrders(getters.userLoggedIn.id)
            .then(response => {
                if(response.status === 200 && response.data) {
                    console.log("The orders: " + response.data);
                    commit('SET_ORDERS', response.data);
                }
            });
    },
};

const getters = {
    userOrders: state => {
        return state.userOrders;
    }
};

export default {
    state,
    mutations,
    actions,
    getters
}