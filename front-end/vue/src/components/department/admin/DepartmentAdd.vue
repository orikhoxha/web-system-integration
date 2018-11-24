<template>
    <div class="account-settings">
        <form @submit.prevent="onSubmit">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" placeholder="Name" v-model="name">
            </div>
            <div class="form-group">
                <label for="price">Main Department</label>
                <input type="text" class="form-control" id="price" placeholder="Main Department" v-model="mainDepartment">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</template>

<script>
    import axios from 'axios';
    export default {
        data() {
            return {
                name: '',
                mainDepartment: ''
            }
        },

        methods: {
            onSubmit() {
                const formData = {mainDepartment: this.mainDepartment, name: this.name};
                this.$store.dispatch('addDepartment',formData);
            }
        }
    }
</script>

<style scoped>

</style>