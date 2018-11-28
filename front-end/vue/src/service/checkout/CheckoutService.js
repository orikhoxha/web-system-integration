import Api from '../Api.js'

export default {

    postCheckout(checkout){
        return Api().post('/checkout/', checkout)
    },
}