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
                <label for="sel1">Select Department:</label>
                <select class="form-control" id="sel1" v-model="selectedDepartment">
                    <option v-for="department in departments" v-bind:value="{ id: department.id, mainDepartment: department.mainDepartment,  name: department.name }">{{department.name}}</option>
                </select>
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
            <div class="form-group">
                <label>Upload an image</label>
                <input type="file"  @change="onFileSelected">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</template>

<script>
    export default {

        /* Item form data initialize */
        data() {
            return {
                description: '',
                price: '',
                measurement: '',
                inStockNumber: '',
                details: '',
                ingredients: '',
                directions: '',
                warnings: '',
                departments: this.$store.getters.departments,
                selectedDepartment: '',
                selectedFile: null
            }
        },

        methods: {
            /* Prevent submit of the form. Send the data to vuex, further to the Item service API */
            onSubmit() {
                const formData = {
                    image: this.selectedFile,
                    item: {description: this.description,
                           price: this.price,
                           measurement: this.measurement,
                           inStockNumber: this.inStockNumber,
                           details: this.details,
                           ingredients: this.ingredients,
                           directions: this.directions,
                           department: this.selectedDepartment,
                           warnings: this.warnings
                    }
                };
                console.log(formData);
                this.$store.dispatch('addItem',formData);
            },

            /* Set the file when it's selected */
            onFileSelected(event) {
                this.selectedFile = event.target.files[0];
            },
        }
    }
</script>

<style scoped>

</style>