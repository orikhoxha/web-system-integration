import Api from '../Api.js'
import  axios from 'axios';

export default {
    getUserShippings(){
        return Api().get('/users/shipping/')
    },

    getUserShipping(id) {
        return Api().get('/users/shipping/' + id);
    },

    postUserShipping(userShipping){
        Api().post('/users/shipping/', userShipping);
    },

    deleteUserShipping(id){
        return Api().delete('/users/1/shipping/' + id);
    }
}