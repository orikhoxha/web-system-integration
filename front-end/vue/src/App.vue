<template>

    <div class="container-fluid">
        <app-header v-if="!isLoginRegister"></app-header>
        <router-view></router-view>
    </div>
</template>

<script>
    import Header from './components/Header.vue';
    export default {
        components: {
            appHeader: Header
        },

        computed: {
            isLoginRegister() {
                let location = window.location.pathname.split("/");
                for(let i = 0; i < location.length; i++){
                    if( location[i] === "login" || location[i] === "register"){
                        return true
                    }
                }
                return false;
            }
        }
    }
</script>

<style>

</style>
