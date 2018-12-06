import Api from '../Api.js'
import  axios from 'axios';

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
            this.postItemImage(image, newId);
        })
    },

    postItemImage(image, id){
        const formData = new FormData();
        formData.append("file", image);
        //formData.append('imageName', id + '_' + image.filename);
        //const headers = {'content-type': 'multipart/form-data'};
        //Api().post('/items/file/upload', formData);
        axios.post('http://limestone.sat.iit.edu/api/items/file/upload', formData, {
            headers: {'Content-Type': 'multipart/form-data'}
        })
    }
}