import Api from '../Api.js'

export default {
    getUserOrders(userId){
        return Api().get('/users/' + userId + '/orders/');
    }
}