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

        /*data() {
            return {
                departments: [
                    {name: 'Meat', subDepartments: ['Chicken','Beef','Fish']},
                    {name: 'Cheese', subDepartments: ['Pervelon','Swiss','Feta']},
                    {name: 'Drinks', subDepartments: ['Cocacola','Fanta','Pepsi']},
                    {name: 'Meat', subDepartments: ['Chicken','Beef','Fish']},
                    {name: 'Meat', subDepartments: ['Chicken','Beef','Fish']},
                ]
            }
        },*/

        computed: {
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