<template>
    <div class="login">
        <div class="logo text-center mb-2">
            <img src="../../assets/logo.png" alt="Logo">
            <h3>Sign in to your account</h3>
        </div>

        <div class="login-form shadow">
            <form id="login-form">
                <div class="form-group relative">
                    <label for="username" class="text-center" >Username or Email Address</label>
                    <input type="text" id="username" class="form-control mx-auto" placeholder="username">
                </div>
                <div class="form-group relative">
                    <label for="password">Password</label>
                    <input type="password" id="password" class="form-control mx-auto" placeholder="password">
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
    }
</script>

<style scoped>

</style>