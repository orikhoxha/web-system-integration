<template>
    <div class="col-md-1">
        <div class="category shadow">
            <div class="category-header">
                <a href="#">
                    <img src="../../assets/sample_image_8.jpg" class="img-category">
                </a>
                <h3>{{department.name}}</h3>
            </div>
            <div class="category-body">
                <ul class="category-menu-sub-categories">
                    <app-sub-departments v-for="subDepartment in department.subDepartments" :subDepartment="subDepartment"></app-sub-departments>
                </ul>
            </div>
            <div class="category-footer text-center">
                <a href="#">More</a>
            </div>
        </div>
    </div>
</template>

<script>
    import SubDepartments from './SubDepartment.vue';
    export default {
        props: ['department'],
        components: {
            appSubDepartments: SubDepartments
        }
    }
</script>

<style scoped>

</style>