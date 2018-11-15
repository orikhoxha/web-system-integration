<template>
    <div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3">
                    <app-user-account-nav></app-user-account-nav>
                </div>
                <div class="col-md-9 settings shadow">
                    <router-view></router-view>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import UserAccountNav from './UserAccountNav.vue';
    export default {

        components: {
            appUserAccountNav: UserAccountNav
        }
    }
</script>

<style scoped>

</style>