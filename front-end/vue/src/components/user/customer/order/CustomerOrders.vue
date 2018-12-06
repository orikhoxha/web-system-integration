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