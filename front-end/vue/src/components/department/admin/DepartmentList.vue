<template>
    <main>
        <div class="account-settings">
            <h4><router-link to="/departments/newDepartment"><a>Add new Department</a></router-link></h4>
            <app-department-search></app-department-search>
            <div class="user-list">
                <div class="row">
                    <div class="col-md-12">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>Main Department</th>
                                <th>Details</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr v-for="department in departments">
                                <td>{{department.name}}</td>
                                <td>{{department.mainDepartment}}</td>
                                <router-link :to="{ name: 'departmentEdit', params:{id: department.id} }" tag="td"><a>Details</a></router-link>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="load-more text-center">
                <a href="" class="btn-load-more">+ Load More</a>
            </div>
        </div>
    </main>
</template>

<script>
    import DepartmentSearch from './DepartmentSearch.vue';
    export default {
        components: {
            appDepartmentSearch: DepartmentSearch
        },

        computed: {
            departments(){
                return this.$store.getters.departments;
            }
        },
    }
</script>

<style scoped>

</style>