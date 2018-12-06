import axios from "axios/index";
import Api from "./Api";

/* User Service. Makes REST Calls to backend */
export default {
    getUsers(){
        return Api().get('/users/')
    },

    getUser(id) {
        return Api().get('/users/' + id);
    },

    postUser(user){
        return Api().post('/users/', user.user)
    },

    updateUser(user){
        return Api().put('/users/' + user.id, user)
    },

    loginUser(userForm) {
        return Api().post('/users/login/', userForm);
    },

    registerUser(userForm) {
        return Api().post('/users/', userForm);
    }
}