import Vue from 'vue';
import Vuex from 'vuex';
import items from './modules/items.js';
import departments from './modules/departments.js';
import cart from './modules/cart.js';
import payment from './modules/payment.js';
import shipping from './modules/shipping.js';
import checkout from './modules/checkout.js';
import user from './modules/user.js';
import order from './modules/orders.js';

Vue.use(Vuex);

export default new Vuex.Store({
    modules: {
        departments: departments,
        items: items,
        cart: cart,
        payment: payment,
        shipping: shipping,
        checkout: checkout,
        user: user,
        order: order
    }
});