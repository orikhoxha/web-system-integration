import Api from '../Api.js'
import  axios from 'axios';

/* User payments service. Makes REST Calls to backend */
export default {
    getUserPayments(userId){
        return Api().get('/users/' + userId + '/payments/');
    },

    getUserPayment(id) {
        return Api().get('/users/payments/' + id);
    },

    postUserPayment(userPayment){
        Api().post('/users/payments/', userPayment);
    },

    deleteUserPayment(id){
        return Api().delete('/users/1/payments/' + id);
    }
}