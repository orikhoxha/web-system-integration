<template>
    <div class="register">
        <div class="logo text-center mb-2">
            <img src="../../assets/logo.png" alt="Logo">
            <h3>Create account</h3>
        </div>

        <div class="register-form shadow">
            <form  @submit.prevent="onSubmit" id="register-form">
                <div class="form-group relative mb-0">
                    <label for="name" class="text-center" >Name*</label>
                    <input type="text" id="name" class="form-control col-md-offset-1" placeholder="Name" v-model="name">
                </div>
                <div class="form-group relative mb-0">
                    <label for="username" class="text-center" >Username</label>
                    <input type="text" id="username" class="form-control col-md-offset-1" placeholder="username" v-model="username">
                </div>
                <div class="form-group relative mb-0">
                    <label for="email" class="text-center" >Email</label>
                    <input type="text" id="email" class="form-control col-md-offset-1" placeholder="email" v-model="email">
                </div>
                <div class="form-group relative mb-0">
                    <label for="password">Password</label>
                    <input type="password" id="password" class="form-control col-md-offset-1" placeholder="password" v-model="password">
                </div>
                <div class="text-center mt-3">
                    <button type="submit" class="btn login-btn">Create Account</button>
                </div>
            </form>
            <div class="register-footer text-center">
                <p>Have an account?</p>
                <router-link to="/login" class="btn btn-transparent">Sign in</router-link>
            </div>
        </div>
    </div>
</template>

<script>
    export default {

        data() {
            return {
                name: '',
                username: '',
                email: '',
                password: ''
            }
        },

        methods: {
            onSubmit() {
                const formData = {
                    name: this.name,
                    username: this.username,
                    email: this.email,
                    password: this.password
                };

                this.$awn.su

                setTimeout(() =>{
                    console.log("execute now");
                    this.$store.dispatch('registerUser', formData);
                    this.$router.push("/");
                }, 3000);

                /*this.$store.dispatch('registerUser', formData);
                this.$router.push("/");*/
            }
        },

        beforeCreate(){
            this.$store.dispatch("changeHeader", false);
        },
    }
</script>

<style scoped>

</style>