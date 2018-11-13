<template>
    <div class="col-md-3 col-xs-12 col-sm-4">
        <router-link class="panel panel-default text-center panel-hover" style="cursor: pointer" tag="div" to="/item/3">
            <a >
            <div class="panel-heading text-right">
                <i class="fas fa-heart custom-heart"></i>
            </div>
            <div class="panel-body">
                <img src="../../assets/sample_image_3.jpg" class="img-article">
            </div>
            <div class="panel-footer">
                <div class="row product-tile">
                    <div class="col-md-6 text-left">
                        <sup class="price-tile-currency-symbol">$</sup>
                        <span class="price-tile-whole-unit">{{item.price}}</span>
                        <sup class="price-tile-partial-units">97</sup>
                    </div>
                    <div class="col-md-6 text-right">
                        <span>{{item.size}}gr</span>
                    </div>
                </div>
                <a href="#" class="product-title text-left">{{item.description}}</a>
                <button class="btn btn-select-product">Add to Cart</button>

            </div></a>
        </router-link>
    </div>
</template>

<script>


    export default {
        props: ['item'],

    }
</script>

<style scoped>

</style>