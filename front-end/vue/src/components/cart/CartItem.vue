<template>
    <div class="row row-custom">
        <div class="col-md-2 cart-item">
                            <span class="tile-image">
                                <div class="image-container">
                                    <img src="../../assets/sample_image_8.jpg" class="img-cart" alt="">
                                </div>
                                <span class="tile-image-quantity">{{cartItem.quantity}}</span>
                            </span>
        </div>
        <div class="col-md-8">{{cartItem.item.description}}</div>
        <div class="col-md-2">{{cartItem.item.price}}</div>
    </div>
</template>

<script>

    /* Single cart item */
    export default {
        props: ['cartItem']
    }
</script>

<style scoped>

</style>