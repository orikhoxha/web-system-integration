<template>
    <aside>
        <div class="col-md-3 cart-container shadow">
            <div class="cart-header">
                <div class="row">
                    <div class="col-md-6 text-left">Your Cart</div>
                    <div class="col-md-6 text-right num-items">{{totalItems}} Items</div>
                </div>
            </div>
            <div class="cart-content">
                <app-cart-item v-for="cartItem in cartItems" :cartItem="cartItem"></app-cart-item>
            </div>
            <div class="cart-footer">
                <div class="row">
                    <div class="col-md-4 minimum-warning">$30 minimum</div>
                    <div class="col-md-8 text-right subtotal-cart">Subtotal <span>${{totalPriceAdded}}</span></div>
                    <div class="col-md-12">
                        <button class="btn btn-checkout full-width" @click="checkout">Checkout</button>
                    </div>
                </div>
            </div>
        </div>
    </aside>
</template>

<script>
    import CartItem from './CartItem.vue';
    export default {

        components: {
          appCartItem: CartItem
        },

        computed: {
            cartItems(){
                return this.$store.getters.cartItemList;
            },

            totalItems(){
                return this.$store.getters.totalItems;
            },

            totalPriceAdded(){
                return this.$store.getters.totalPriceAdded;
            }
        },

        methods: {
            checkout() {
                this.$router.push('/checkout');
            }
        }
    }
</script>

<style scoped>

</style>