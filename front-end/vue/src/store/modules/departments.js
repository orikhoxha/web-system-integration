import DepartmentService from "../../service/department/DepartmentsService.js";


const state = {
    departments: []
};

const mutations = {
    'SET_DEPARTMENTS' (state,departments) {
        state.departments = departments;
    },

    'ADD_DEPARTMENT' (state, department) {
        state.departments.push({
            department
        })
    },
    /*'DELETE_STOCK' (state, {id}){
        const record = state.items.find(element => element.id === id);
        state.items.splice(state.items.indexOf(record), 1);
    }*/
};

const actions = {
    initDepartments: ({commit}) => {
        DepartmentService.getDepartments()
            .then(response => {
                if(response.status === 200 && response.data) {
                    commit('SET_DEPARTMENTS', response.data);
                }
            });
    },
    addDepartment({commit}, department) {
        console.log(department);
        DepartmentService.postDepartment(department);
        commit('ADD_DEPARTMENT', department);
    }
};

const getters = {
    departments: state => {
        return state.departments;
    }

};

export default {
    state,
    mutations,
    actions,
    getters
}