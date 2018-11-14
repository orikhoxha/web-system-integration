<template>
    <aside>
        <div class="col-md-3 cart-container shadow">
            <div class="cart-header">
                <div class="row">
                    <div class="col-md-6 text-left">Your Cart</div>
                    <div class="col-md-6 text-right num-items">12 Items</div>
                </div>
            </div>
            <div class="cart-content">
                <app-cart-item v-for="cartItem in cartItems" :cartItem="cartItem"></app-cart-item>
            </div>
            <div class="cart-footer">
                <div class="row">
                    <div class="col-md-4 minimum-warning">$30 minimum</div>
                    <div class="col-md-8 text-right subtotal-cart">Subtotal <span>$19</span></div>
                    <div class="col-md-12 ">
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

        data() {
            return {
                cartItems: [
                    {id: 1, quantity: 3, description: "Chocolate", price: "3.14"},
                    {id: 1, quantity: 3, description: "Chocolate", price: "3.14"},
                    {id: 1, quantity: 3, description: "Chocolate", price: "3.14"},
                    {id: 1, quantity: 3, description: "Chocolate", price: "3.14"},
                    {id: 1, quantity: 3, description: "Chocolate", price: "3.14"}
                ]
            }
        },
        components: {
          appCartItem: CartItem
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