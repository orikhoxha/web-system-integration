<template>
    <div class="col-md-1">
        <div class="order">
            <div class="order-body">
                <div class="image-container">
                    <img src="../../../../assets/sample_image.jpg" alt="" class="custom-image-order">
                </div>
                <span class="tile-image-quantity">{{cartItem.quantity}}</span>
            </div>
            <div class="order-footer">
                <p>{{cartItem.description}}</p>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props: ['cartItem']
    }
</script>

<style scoped>

</style>