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
        }
    }
</script>

<style scoped>

</style>