<template>
    <div class="register">
        <div class="logo text-center mb-2">
            <img src="../../assets/logo.png" alt="Logo">
            <h3>Create account</h3>
        </div>

        <div class="register-form shadow">
            <form @submit.prevent="handleSubmit" id="register-form">
                <div class="form-group relative mb-0">
                    <label for="name" class="text-center" >Name*</label>
                    <input type="text" id="name" class="form-control mx-auto" placeholder="Name">
                </div>
                <div class="form-group relative mb-0">
                    <label for="username" class="text-center" >Username</label>
                    <input type="text" id="username" class="form-control mx-auto" placeholder="username">
                </div>
                <div class="form-group relative mb-0">
                    <label for="email" class="text-center" >Email</label>
                    <input type="text" id="email" class="form-control mx-auto" placeholder="email">
                </div>
                <div class="form-group relative mb-0">
                    <label for="password">Password</label>
                    <input type="password" id="password" class="form-control mx-auto" placeholder="password">
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
        methods: {
            handleSubmit() {
                this.$router.push('/home');
            }
        }
    }
</script>

<style scoped>

</style>