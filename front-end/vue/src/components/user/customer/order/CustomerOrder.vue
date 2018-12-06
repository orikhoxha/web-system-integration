<template>
    <div class="row">
        <div class="col-md-12">
            <div class="orders-date">
                <h5>Dec 7, 2018</h5>
            </div>
        </div>
        <app-customer-order-status v-if="order.orderStatus === 'PROCESSING'" :arrivesBy="shippingDateTime" ></app-customer-order-status>
        <app-customer-order-item v-for="cartItem in order.cartItemList" :cartItem="cartItem"></app-customer-order-item>
        <app-customer-order-price :priceDetails="order.orderTotal"></app-customer-order-price>

    </div>
</template>

<script>
    import CustomerOrderItem from './CustomerOrderItem.vue';
    import CustomerOrderPrice from './CustomerOrderPrice.vue';
    import CustomerOrderStatus from './CustomerOrderStatus.vue';
    import Utils from '../../../../utils.js';
    export default {


        data() {
            return {
                shippingDateTime: this.order.shippingDate + " between " + this.order.shippingTime
            }
        },

        props: ['order'],
        components: {
            appCustomerOrderItem: CustomerOrderItem,
            appCustomerOrderPrice: CustomerOrderPrice,
            appCustomerOrderStatus: CustomerOrderStatus
        },



        computed: {
            convertTime(){
                return Utils.convertUnixTime(this.order.date);
            }
        }


    }
</script>

<style scoped>

</style>