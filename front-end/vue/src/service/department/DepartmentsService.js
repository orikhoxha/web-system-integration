import Api from '../Api.js'
import  axios from 'axios';
export default {
    getDepartments(){
        return Api().get('/departments/');
    },


    getDepartment(id) {
        return Api().get('/departments/' + id);
    },

    postDepartment(department){
        Api().post('/departments/', department).then(res => {
            const data = res.data;
            // const newId = data.id;
            //this.postDepartmentImage(image, newId);
        })
    },

    /*postDepartmentImage(image, id){
        const formData = new FormData();
        formData.append("file", image);
        //formData.append('imageName', id + '_' + image.filename);
        //const headers = {'content-type': 'multipart/form-data'};
        //Api().post('/Departments/file/upload', formData);
        axios.post('http://localhost:8082/api/departments/file/upload', formData, {
            headers: {'Content-Type': 'multipart/form-data'}
        })
    }*/
}