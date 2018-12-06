import Api from '../Api.js'

/* User orders service. Makes REST Calls to backend */
export default {
    getUserOrders(userId){
        return Api().get('/users/' + userId + '/orders/');
    }
}