import Api from '../Api.js'
export default {
    getItems(){
        return Api().get('/items/')
    },

    getItem(id) {
        return Api().get('/items/' + id);
    },

    postItem(item){
        Api().post('/items/', item)
    }
}