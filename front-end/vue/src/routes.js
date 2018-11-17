import Home from './components/Home.vue';
import FavouriteItems from './components/items/FavouriteItems.vue';
import Departments from './components/department/Departments.vue';
import Items from './components/items/Items.vue';
import ItemDetails from './components/items/ItemDetails.vue';

import Login from './components/login/Login.vue';
import Register from './components/register/Register.vue';

import Checkout from './components/checkout/Checkout.vue';
import CheckoutFinal from './components/checkout/CheckoutFinal.vue';

import UserAccount from './components/user/UserAccount.vue';
import UserAccountSettings from './components/user/UserAccountSettings.vue';
import UserAddresses from './components/user/UserAddresses.vue';

import CustomerOrders from './components/user/customer/order/CustomerOrders.vue';
import CustomerPayments from './components/user/customer/payment/CustomerPayments.vue';

import CustomerList from './components/user/customer/list/CustomerList.vue';

export const routes = [
    { path: '/', component: Home, alias: '/home', children: [
            { path: '/', component: Items},
            { path: '/item/:id', component: ItemDetails}
        ]},
    { path: '/favourites', component: FavouriteItems},
    { path: '/departments', component: Departments},
    { path: '/login', component: Login},
    { path: '/register', component: Register},
    { path: '/checkout', component: Checkout},
    { path: '/checkoutFinal', component: CheckoutFinal},
    { path: '/account', component: UserAccount, children: [
            { path: '/', component: UserAccountSettings, alias: '/account/settings'},
            { path: '/userAddresses', component: UserAddresses, alias: '/account/addresses'},
            { path: '/customerOrders', component: CustomerOrders, alias: '/account/orders'},
            { path: '/payments', component: CustomerPayments, alias: '/account/payments'},
            { path: '/customers', component: CustomerList, alias: '/account/customers'}
            ]},
]