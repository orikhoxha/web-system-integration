import UserService from '../../service/UserService.js';

const state = {
    users: [],
    userLoggedIn: null,
    changeHeader: true

};

const mutations = {
    'SET_USERS' (state,users) {
        state.users = users;
    },
    'ADD_USER' (state, user) {
        state.users.push({
            user
        })
    },

    'ADD_USER_LOGGED_IN' (state, user){
        state.userLoggedIn = user;
    },
    'REMOVE_USER_LOG_OUT' (state) {
        state.userLoggedIn = null
    },

    'UPDATE_USER_LOCAL'(state,user){
        state.userLoggedIn = user;
    },

    'CHANGE_HEADER' (state, changeHeader) {
        state.changeHeader = changeHeader;
    }
};

const actions = {
    initUsers: ({commit}) => {
        UserService.getUsers()
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_USERS', response.data);
                }
            });
    },

    addUser({commit}, user) {
        UserService.postUser(user);
        commit('ADD_USER', user);
    },

    updateUserLocal({commit}, user){
        commit('UPDATE_USER_LOCAL', user);
    },

    updateUser({commit, getters}){
        UserService.updateUser(getters.userLoggedIn).then(response => {
            commit('ADD_USER_LOGGED_IN', response.data)
        });
    },

    loginUser({commit}, userForm) {
        UserService.loginUser(userForm).then(res =>{
            console.log(res);
            commit('ADD_USER_LOGGED_IN', res.data);
        });
    },

    registerUser({commit}, userForm) {
        UserService.registerUser(userForm).then(res =>{
            commit('ADD_USER_LOGGED_IN', res.data);
        });
        //commit('ADD_USER', userForm);
    },

    removeUserLogout({commit}){
        commit('REMOVE_USER_LOG_OUT');
    },

    changeHeader({commit}, changeHeader) {
        commit('CHANGE_HEADER', changeHeader);
    },

    /*userChangeLocal({commit}, prop) {
        commit('CHANGE_USER_LOCAL', prop)
    }*/
};

const getters = {
    users: state => {
        return state.users;
    },
    userLoggedIn: state => {
        return state.userLoggedIn;
    },

    showHeader: state => {
        return state.changeHeader;
    }
};

export default {
    state,
    mutations,
    actions,
    getters
}