import Home from './components/Home.vue';
import Favourites from './components/favourites/Favourites.vue';
import Departments from './components/department/Departments.vue';
import ItemDetails from './components/items/ItemDetails.vue';

export const routes = [
    { path: '/', component: Home, alias: '/home', children: [
            { path: }
        ] },
    { path: '/favourites', component: Favourites},
    { path: '/departments', component: Departments},
    { path: '/item/:id', component: ItemDetails}
]