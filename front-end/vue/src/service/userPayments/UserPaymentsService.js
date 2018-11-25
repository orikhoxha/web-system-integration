import Api from '../Api.js'
import  axios from 'axios';

export default {
    getUserPayments(){
        return Api().get('/users/payments/')
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