<template>
    <div>
        <div class="row">
            <div class="articles-overview">
                <div class="col-md-4">
                    <div class="image-container">
                        <div class="article-image">
                            <img src="../../assets/sample_image.jpg" alt="" >
                        </div>
                        <span class="image-quantity">{{cartItem.quantity}}</span>
                    </div>
                </div>
                <div class="col-md-4">
                    <p class="article-description">{{cartItem.item.description}}</p>
                </div>
                <div class="col-md-4"><span class="article-price">{{cartItem.item.price}}</span></div>
            </div>
        </div>
        <hr>
    </div>
</template>

<script>
    export default {
        props: ['cartItem']
    }
</script>

<style scoped>

</style>