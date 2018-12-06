import Api from '../Api.js'
import  axios from 'axios';

/* Department Service. Makes REST Calls to backend */
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

}