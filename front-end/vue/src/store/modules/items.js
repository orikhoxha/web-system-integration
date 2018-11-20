import items from '../../data/items.js';

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
    'DELETE_STOCK' (state, {id}){
        const record = state.items.find(element => element.id === id);
        state.items.splice(state.items.indexOf(record), 1);
    }
};

const actions = {
    initItems: ({commit}) => {
        commit('SET_ITEMS', items);
    },
    addItem({commit}, item) {
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