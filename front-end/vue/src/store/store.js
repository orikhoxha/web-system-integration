import Vue from 'vue';
import Vuex from 'vuex';
import items from './modules/items.js';
import departments from './modules/departments.js'

Vue.use(Vuex);

export default new Vuex.Store({
    modules: {
        departments: departments,
        items: items
    }
});