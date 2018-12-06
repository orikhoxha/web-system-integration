<template>
    <div class="col-md-3 col-xs-12 col-sm-4">
        <div class="panel panel-default text-center panel-hover">
            <a>
            <div class="panel-heading text-right">
                <i class="fas fa-heart custom-heart"></i>
            </div>
            <router-link class="panel-body" style="cursor: pointer" tag="div" :to="{name: 'itemDetails', params:{id: item.id}}">
                <img :src="require('../../assets/sample_image_3.jpg')" class="img-article">
            </router-link>
            <div class="panel-footer">
                <div class="row product-tile">
                    <div class="col-md-6 text-left">
                        <sup class="price-tile-currency-symbol">$</sup>
                        <span class="price-tile-whole-unit">{{item.price}}</span>
                    </div>
                    <div class="col-md-6 text-right">
                        <span>{{item.measurement}}gr</span>
                    </div>
                </div>
                <a href="#" class="product-title text-left">{{item.description}}</a>
                <button @click="addToCart" class="btn btn-select-product">Add to Cart</button>

            </div></a>
        </div>
    </div>
</template>

<script>
    export default {
        props: ['item'],

        methods: {
            addToCart(){
                const theItem = {
                    itemId: this.item.id,
                    quantity: 1,
                    price: this.item.price,
                    description: this.item.description
                };
                this.$store.dispatch('addItemCart',theItem);
            },
        }
    }
</script>

<style scoped>

</style>