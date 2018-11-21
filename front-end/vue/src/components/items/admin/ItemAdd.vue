<template>
    <div class="account-settings">
        <form @submit.prevent="onSubmit">
            <div class="form-group">
                <label for="description">Description</label>
                <input type="text" class="form-control" id="description" placeholder="Description" v-model="description">
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <input type="text" class="form-control" id="price" placeholder="Price" v-model="price">
            </div>
            <div class="form-group">
                <label for="measurement">Measurement</label>
                <input type="text" class="form-control" id="measurement" placeholder="Measurement" v-model="measurement">
            </div>
            <div class="form-group">
                <label for="inStockNumber">In Stock Number</label>
                <input type="text" class="form-control" id="inStockNumber" placeholder="In Stock Number" v-model="inStockNumber">
            </div>
            <div class="form-group">
                <label for="inStockNumber">Details</label>
                <textarea class="form-control" id="details" placeholder="Add details" v-model="details"></textarea>
            </div>
            <div class="form-group">
                <label for="ingredients">Ingredients</label>
                <textarea class="form-control" id="ingredients" placeholder="Add ingredients" v-model="ingredients"></textarea>
            </div>
            <div class="form-group">
                <label for="directions">Directions</label>
                <textarea class="form-control" id="directions" placeholder="Add directions" v-model="directions"></textarea>
            </div>
            <div class="form-group">
                <label for="warnings">Warnings</label>
                <textarea class="form-control" id="warnings" placeholder="Add warnings" v-model="warnings"></textarea>
            </div>
            <!--<div class="form-group">
                <label for="exampleInputFile">File input</label>
                <input type="file" id="exampleInputFile">
                <p class="help-block">Example block-level help text here.</p>
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Check me out
                </label>
            </div>-->
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</template>

<script>
    import axios from 'axios';
    export default {
        data() {
            return {
                description: '',
                price: '',
                measurement: '',
                inStockNumber: '',
                details: '',
                ingredients: '',
                directions: '',
                warnings: ''
            }
        },

        methods: {
            onSubmit() {
                const formData = {
                    description: this.description,
                    price: this.price,
                    measurement: this.measurement,
                    inStockNumber: this.inStockNumber,
                    details: this.details,
                    ingredients: this.ingredients,
                    directions: this.directions,
                    warnings: this.warnings
                };

                this.$store.dispatch('addItem',formData);
            }
        }

    }
</script>

<style scoped>

</style>