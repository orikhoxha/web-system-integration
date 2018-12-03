<template>

    <div class="container-fluid">
        <app-header v-if="showHeader"></app-header>
        <router-view></router-view>
    </div>
</template>

<script>
    import Header from './components/Header.vue';
    export default {

        components: {
            appHeader: Header,
        },

        computed: {
            showHeader() {
                return this.$store.getters.showHeader;
            }
        }
    }
</script>

<style>

</style>
