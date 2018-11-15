<template>
    <div class="col-md-1 price-total-wrap">
        <div class="row">
            <div class="col-md-8">
                <span class="price-label">Subtotal</span>
            </div>
            <div class="col-md-4">
                <span class="price">{{priceDetails.subtotal}}$</span>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8">
                <span class="price-label">Value Shipping</span>
            </div>
            <div class="col-md-4">
                <span class="price">{{priceDetails.valueShipping}}$</span>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8">
                <span class="price-label">Est.tax</span>
            </div>
            <div class="col-md-4">
                <span class="price">{{priceDetails.estTax}}$</span>
            </div>
        </div>
        <hr>
        <div class="row">
            <div class="col-md-8">
                <span class="price-label">Total</span>
            </div>
            <div class="col-md-4">
                <span class="price total">{{priceDetails.total}}$</span>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props: ['priceDetails']
    }
</script>

<style scoped>

</style>