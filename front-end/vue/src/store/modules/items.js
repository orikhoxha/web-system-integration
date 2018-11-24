import ItemsService from '../../service/item/ItemsService.js';

const state = {
    items: []
};

const mutations = {
    'SET_ITEMS' (state,items) {
        state.items = items;
    },
    'ADD_ITEM' (state, item) {
        state.items.push({
            item
        })
    },
    /*'DELETE_STOCK' (state, {id}){
        const record = state.items.find(element => element.id === id);
        state.items.splice(state.items.indexOf(record), 1);
    }*/
};

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