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
    import Items from './items/Items.vue';
    import ItemDetails from './items/ItemDetails.vue';
    export default {
        components: {
           appCart: Cart,
            appItems: Items,
            appItemDetails: ItemDetails
        }
    }
</script>

<style scoped>

</style>