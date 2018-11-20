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
                inStockNumber: ''
            }
        },

        methods: {
            onSubmit() {
                const formData = {
                    description: this.description,
                    price: this.price,
                    measurement: this.measurement,
                    inStockNumber: this.inStockNumber
                };

                axios.post("http://localhost:8082/api/items/", formData)
                    .then(res => console.log(res))
                    .catch(error => console.log(error))
            }
        }

    }
</script>

<style scoped>

</style>