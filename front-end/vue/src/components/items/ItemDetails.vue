<template>
    <div class="col-md-9">
        <div class="row">
            <div class="col-md-5">
                <div class="panel panel-default text-center panel-product-detail">
                    <div class="panel-heading text-right padding-0">
                        <i class="fas fa-heart custom-heart"></i>
                    </div>
                    <div class="panel-body">
                        <img src="../../assets/sample_image_2.jpg" class="img-article-detail">
                    </div>
                    <div class="panel-footer text-right">
                        <i class="fas fa-search-plus custom-zoom"></i>
                    </div>
                </div>
            </div>
            <div class="col-md-7">
                <div class="product-tile-details">
                    <a href="#" class="product-title">
                        <div>{{description}} &nbsp; {{measurement}} oz</div>
                    </a>
                    <div class="price-container">
                            <span class="product-tile-price-container">
                                <sup class="price-tile-currency">$</sup>
                                <span class="price-tile-unit">{{getPriceDetail(1)}}</span>
                                <sup class="price-tile-partial-unit">{{getPriceDetail(2)}}</sup>
                            </span>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <h3>Details</h3>
                <p class="text-left">{{details}}
                </p>

                <hr>
            </div>
            <div class="col-md-6">
                <h3>Ingredients</h3>
                <p class="text-left">{{ingredients}}
                </p>

                <hr>
            </div>
            <div class="col-md-6">
                <h3>Directions</h3>
                <p class="text-left">{{directions}}
                </p>

                <hr>
            </div>
            <div class="col-md-6">
                <h3>Warnings</h3>
                <p class="text-left">{{warnings}}</p>
            </div>
        </div>
        <div class="row">
            <div class="similar-products">
                <h3>Similar products</h3>
                <div class="col-sm-3">
                    <div class="panel panel-default text-center panel-hover">
                        <div class="panel-heading text-right">
                            <i class="fas fa-heart custom-heart"></i>
                        </div>
                        <div class="panel-body">
                            <img src="../../assets/sample_image_2.jpg" class="img-article">
                        </div>
                        <div class="panel-footer">
                            <div class="row product-tile">
                                <div class="col-md-6 text-left">
                                    <sup class="price-tile-currency-symbol">$</sup>
                                    <span class="price-tile-whole-unit">3</span>
                                    <sup class="price-tile-partial-units">97</sup>
                                </div>
                                <div class="col-md-6 text-right">
                                    <span>40gr</span>
                                </div>
                            </div>
                            <a href="#" class="product-title text-left">This is the description</a>
                            <button class="btn btn-select-product">Add to Cart</button>

                        </div>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="panel panel-default text-center panel-hover">
                        <div class="panel-heading text-right">
                            <i class="fas fa-heart custom-heart"></i>
                        </div>
                        <div class="panel-body">
                            <img src="images/sample_image_2.jpg" class="img-article">
                        </div>
                        <div class="panel-footer">
                            <div class="row product-tile">
                                <div class="col-md-6 text-left">
                                    <sup class="price-tile-currency-symbol">$</sup>
                                    <span class="price-tile-whole-unit">3</span>
                                    <sup class="price-tile-partial-units">97</sup>
                                </div>
                                <div class="col-md-6 text-right">
                                    <span>40gr</span>
                                </div>
                            </div>
                            <a href="#" class="product-title text-left">This is the description</a>
                            <button class="btn btn-select-product">Add to Cart</button>

                        </div>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="panel panel-default text-center panel-hover">
                        <div class="panel-heading text-right">
                            <i class="fas fa-heart custom-heart"></i>
                        </div>
                        <div class="panel-body">
                            <img src="images/sample_image_2.jpg" class="img-article">
                        </div>
                        <div class="panel-footer">
                            <div class="row product-tile">
                                <div class="col-md-6 text-left">
                                    <sup class="price-tile-currency-symbol">$</sup>
                                    <span class="price-tile-whole-unit">3</span>
                                    <sup class="price-tile-partial-units">97</sup>
                                </div>
                                <div class="col-md-6 text-right">
                                    <span>40gr</span>
                                </div>
                            </div>
                            <a href="#" class="product-title text-left">This is the description</a>
                            <button class="btn btn-select-product">Add to Cart</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="panel panel-default text-center panel-hover">
                        <div class="panel-heading text-right">
                            <i class="fas fa-heart custom-heart"></i>
                        </div>
                        <div class="panel-body">
                            <img src="images/sample_image_2.jpg" class="img-article">
                        </div>
                        <div class="panel-footer">
                            <div class="row product-tile">
                                <div class="col-md-6 text-left">
                                    <sup class="price-tile-currency-symbol">$</sup>
                                    <span class="price-tile-whole-unit">3</span>
                                    <sup class="price-tile-partial-units">97</sup>
                                </div>
                                <div class="col-md-6 text-right">
                                    <span>40gr</span>
                                </div>
                            </div>
                            <a href="#" class="product-title text-left">This is the description</a>
                            <button class="btn btn-select-product">Add to Cart</button>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import ItemsService from '../../service/item/ItemsService.js';
    export default {

        /* Initialize the form data for Item */
        data(){
            return {
                itemId: this.$route.params.id,
                description: '',
                details: '',
                warnings: '',
                directions: '',
                ingredients: '',
                price: '',
                measurement: ''
            }
        },


        /* Call the getItemDetails when the component is mounted */
        mounted(){
            this.getItemDetails(this.itemId)
        },

        methods: {

            /* Directly make call to the service rest api for getting a single item */
            async getItemDetails(params) {
                const response = await ItemsService.getItem(params);
                console.log(response);
                let data = response.data;
                this.description = data.description;
                this.details = data.details;
                this.warnings = data.warnings;
                this.ingredients = data.ingredients;
                this.directions = data.directions;
                this.measurement = data.measurement;
            },

            /* Utils */
            /* Get the two parts of the price */
            getPriceDetail(n){
                return this.price.split(",")[n];
            },
        }
    }
</script>

<style scoped>

</style>