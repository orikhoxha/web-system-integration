<template>
    <div class="row row-custom">
        <div class="col-md-2 cart-item">
                            <span class="tile-image">
                                <div class="image-container">
                                    <img src="../../assets/sample_image_8.jpg" class="img-cart" alt="">
                                </div>
                                <span class="tile-image-quantity">3</span>
                            </span>
        </div>
        <div class="col-md-8">Description</div>
        <div class="col-md-2">Price</div>
    </div>
</template>

<script>
    export default {
        props: ['cartItem']
    }
</script>

<style scoped>

</style>