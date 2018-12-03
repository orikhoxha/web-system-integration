<template>
    <main class="container-fluid">
        <div class="row">
            <div class="col-md-9">
                <div class="row">
                    <router-view></router-view>
                </div>
            </div>
            <app-cart></app-cart>
        </div>
    </main>
</template>

<script>
    import Cart from './cart/Cart.vue';
    export default {
        components: {
           appCart: Cart,
        },

        // Get the items and departments on first load of the Home component
        created() {
            this.$store.dispatch('initItems');
            this.$store.dispatch('initDepartments');
        },

        beforeCreate(){
            this.$store.dispatch("changeHeader", true);
        },


    }
</script>

<style scoped>

</style>