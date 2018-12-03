<template>
    <div class="login">
        <div class="logo text-center mb-2">
            <img src="../../assets/logo.png" alt="Logo">
            <h3>Sign in to your account</h3>
        </div>

        <div class="login-form shadow  text-center">
            <form @submit.prevent="onSubmit" id="login-form">
                <div class="form-group relative">
                    <label for="username" class="text-center" >Username or Email Address</label>
                    <input type="text" id="username" class="form-control  col-md-offset-1" placeholder="username" v-model="username">
                </div>
                <div class="form-group relative">
                    <label for="password">Password</label>
                    <input type="password" id="password" class="form-control col-md-offset-1" placeholder="password" v-model="password">
                </div>
                <div class="text-center">
                    <button type="submit" class="btn login-btn">Sign in</button>
                </div>
            </form>
            <div class="login-footer text-center">
                <p>Don't have an account?</p>
                <router-link class="btn btn-transparent" to="/register">Create an account</router-link>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                username: '',
                password: ''
            }
        },

        methods: {
            onSubmit() {
                const formData = {
                    username: this.username,
                    password: this.password
                };
                this.$store.dispatch('loginUser', formData);
                this.$router.push("/");
            }
        },

        beforeCreate(){
            this.$store.dispatch("changeHeader", false);
        },
    }
</script>

<style scoped>

</style>