import Home from './components/Home.vue';
import Favourites from './components/favourites/Favourites.vue';
import Departments from './components/department/Departments.vue';
import Items from './components/items/Items.vue';
import ItemDetails from './components/items/ItemDetails.vue';

export const routes = [
    { path: '/', component: Home, alias: '/home', children: [
            { path: '/', component: Items},
            { path: '/item/:id', component: ItemDetails}
        ]},
    { path: '/favourites', component: Favourites},
    { path: '/departments', component: Departments}
]