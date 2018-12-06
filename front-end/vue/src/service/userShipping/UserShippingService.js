import Api from '../Api.js'
import  axios from 'axios';

/* User shipping service. Makes REST Calls to backend */
export default {
    getUserShippings(userId){
        return Api().get('/users/' + userId + '/shippings/');
    },

    getUserShipping(id) {
        return Api().get('/users/shipping/' + id);
    },

    postUserShipping(userShipping, userId){
        Api().post('/users/' + userId +'/shippings/', userShipping);
    },

    deleteUserShipping(id, userLoggedIn){
        return Api().delete('/users/' + userLoggedIn +'/shipping/' + id);
    }
}