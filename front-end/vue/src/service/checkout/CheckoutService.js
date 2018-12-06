import Api from '../Api.js'

/* Checkout Service. Makes REST Calls to backend */
export default {

    postCheckout(checkout){
        return Api().post('/checkout/', checkout)
    },
}