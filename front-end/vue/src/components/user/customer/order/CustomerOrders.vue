<template>
    <main>
        <div class="orders">
            <app-customer-order v-for="order in customerOrders" :order="order"></app-customer-order>
        </div>
    </main>
</template>

<script>
    import CustomerOrder from './CustomerOrder.vue';
    export default {

        components: {
            appCustomerOrder: CustomerOrder
        },

        /* Get the orders from the vuex store before the vue component is created */
        beforeCreate(){
            this.$store.dispatch('initOrders');
        },

        computed: {
            customerOrders(){
                return this.$store.getters.userOrders;
            }
        }
    }
</script>

<style scoped>

</style>