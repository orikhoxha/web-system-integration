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
import CustomerAddresses from './components/user/customer/address/CustomerAddresses.vue';

import CustomerOrders from './components/user/customer/order/CustomerOrders.vue';
import CustomerPayments from './components/user/customer/payment/CustomerPayments.vue';

import ItemList from './components/items/admin/ItemList.vue';
import ItemEdit from './components/items/admin/ItemEdit.vue'
import ItemAdd from './components/items/admin/ItemAdd.vue';

import DepartmentList from './components/department/admin/DepartmentList.vue';
import DepartmentAdd from './components/department/admin/DepartmentAdd.vue';


/* Routes that make the SPA */
export const routes = [
    { path: '/', component: Home, alias: '/home', children: [
            { path: '/', component: Items},
            { path: '/item/:id',name:'itemDetails', component: ItemDetails}
        ]},
    { path: '/favourites', component: FavouriteItems},
    { path: '/departments', component: Departments},
    { path: '/login', component: Login},
    { path: '/register', component: Register},
    { path: '/checkout', component: Checkout},
    { path: '/checkoutFinal', component: CheckoutFinal},
    { path: '/account', component: UserAccount, children: [
            { path: '/', component: UserAccountSettings, alias: '/account/settings'},
            { path: '/customerAddresses', component: CustomerAddresses, alias: '/account/addresses'},
            { path: '/customerOrders', component: CustomerOrders, alias: '/account/orders'},

            { path: '/payments', component: CustomerPayments, alias: '/account/payments'},
            { path: '/items/list', component: ItemList, alias: "/account/items/list"},
            { path: '/items/newItem', component: ItemAdd},
            { path: '/items/:id', component: ItemEdit, name:'itemEdit'},

            { path: '/departments/list', component: DepartmentList, alias: "/account/departments/list"},
            { path: '/departments/newDepartment', component: DepartmentAdd},
            { path: '/departments/:id', component: ItemEdit, name:'departmentEdit'},
            ]},
];
