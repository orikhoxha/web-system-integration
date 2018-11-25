import Api from '../Api.js'
import  axios from 'axios';

export default {
    getUserPayments(){
        return Api().get('/user/payments')
    },

    getUserPayment(id) {
        return Api().get('/user/payments/' + id);
    },

    postUserPayment(userPayment){
        Api().post('/user/payments/', userPayment);
    }
}