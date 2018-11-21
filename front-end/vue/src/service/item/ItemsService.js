import Api from '../Api.js'
export default {
    getItems(){
        return Api().get('/items/')
    },

    getItem(id) {
        return Api().get('/items/' + id);
    },

    postItem(item){
        const image = item.image;
        Api().post('/items/', item.item).then(res => {
            const data = res.data;
            const newId = data.id;
            this.postItemImage(image, id);
        })
    },

    postItemImage(image){
        const formData = new FormData();
        formData.append('file', image, id + '_' + image.filename);
    }
}