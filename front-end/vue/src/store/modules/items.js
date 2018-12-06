import ItemsService from '../../service/item/ItemsService.js';

const state = {
    items: []
};

/* Set the items accordingly */
const mutations = {
    'SET_ITEMS' (state,items) {
        state.items = items;
    },
    'ADD_ITEM' (state, item) {
        state.items.push({
            item
        })
    },
};

/* Set the items by calling the REST API-s */
const actions = {
    initItems: ({commit}) => {
        ItemsService.getItems()
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_ITEMS', response.data);
                }
            });
    },
    addItem({commit}, item) {
        ItemsService.postItem(item);
        commit('ADD_ITEM', item);
    }
};

/* Allow accees to  the items */
const getters = {
    items: state => {
        return state.items;
    }

};

export default {
    state,
    mutations,
    actions,
    getters
}