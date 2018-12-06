import DepartmentService from "../../service/department/DepartmentsService.js";


const state = {
    departments: []
};



/* Set the department array accordingly */
const mutations = {
    'SET_DEPARTMENTS' (state,departments) {
        state.departments = departments;
    },

    'ADD_DEPARTMENT' (state, department) {
        state.departments.push({
            department
        })
    },
};

/* Set department by calling the REST API-s */
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


/* Allow accees to  the departments */
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