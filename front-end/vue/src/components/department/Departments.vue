<template>
    <div class="container">
        <div class="row">
            <div class="categories">
                <app-department v-for="department in departments" :department="department" ></app-department>
            </div>
        </div>
    </div>
</template>

<script>
    import Department from './Department.vue';
    import utils from '../../utils.js';
    export default {

        computed: {
            /* Get the departments, and group by in the Utils.js */
            departments(){
                //return this.$store.getters.departmentsGroupByMainDepartment;
                return utils.groupBy(this.$store.getters.departments, 'mainDepartment');
            },

        },

        components: {
            appDepartment: Department
        },



    }
</script>

<style scoped>

</style>