<template>
    <div class="row">
        <div class="col-md-12">
            <div class="orders-date">
                <h5>{{order.date}}</h5>
            </div>
        </div>
        <app-customer-order-item v-for="item in order.items" :item="item"></app-customer-order-item>
        <app-customer-order-price :priceDetails="order.priceDetails"></app-customer-order-price>

    </div>
</template>

<script>
    import CustomerOrderItem from './CustomerOrderItem.vue';
    import CustomerOrderPrice from './CustomerOrderPrice.vue';
    export default {
        props: ['order'],
        components: {
            appCustomerOrderItem: CustomerOrderItem,
            appCustomerOrderPrice: CustomerOrderPrice
        }
    }
</script>

<style scoped>

</style>