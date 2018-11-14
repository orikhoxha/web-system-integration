import Home from './components/Home.vue';
import FavouriteItems from './components/items/FavouriteItems.vue';
import Departments from './components/department/Departments.vue';
import Items from './components/items/Items.vue';
import ItemDetails from './components/items/ItemDetails.vue';
import Login from './components/login/Login.vue';
import Register from './components/register/Register.vue';
import Checkout from './components/checkout/Checkout.vue';
import CheckoutFinal from './components/checkout/CheckoutFinal.vue';

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
    { path: '/checkoutFinal', component: CheckoutFinal}
]