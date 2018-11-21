import Api from '../Api.js'
export default {
    getItems(){
        return Api().get('/items/')
    },

    postItem(item){
        Api().post('/items/', item)
    }
}