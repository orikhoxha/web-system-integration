<template>
    <!--Change address -->
    <div class="modal fade bs-example-modal-md add-change-address-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
        <div class="modal-dialog modal-md" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                </div>
                <form @submit.prevent="onSubmit">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col">
                                <div class="form-group address-input">
                                    <input type="text" class="form-control" placeholder="Address Line 1" id="shippingAddressName" v-model="shippingAddressName">
                                </div>
                                <div class="form-group  address-input">
                                    <input type="text" class="form-control" placeholder="Address Line 2(Optional)" id="shippingAddressStreet1" v-model="shippingAddressStreet1">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Zip Code" id="shippingAddressZipcode" v-model="shippingAddressZipcode">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="City" id="shippingAddressCity" v-model="shippingAddressCity">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="State" id="shippingAddressState" v-model="shippingAddressState">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="form-group address-input">
                                    <input type="text" class="form-control" placeholder="Instructions for delivery(optional)" id="instructions" v-model="instructions">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-save-modal">Save changes</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
    export default {

        data() {
            return {
                shippingAddressName: '',
                shippingAddressStreet1: '',
                shippingAddressCity: '',
                shippingAddressState: '',
                shippingAddressZipcode: '',
                instructions: ''
            }
        },

        methods: {
            onSubmit() {
                const formData = {
                    shippingAddressName: this.shippingAddressName,
                    shippingAddressStreet1: this.shippingAddressStreet1,
                    shippingAddressCity: this.shippingAddressCity,
                    shippingAddressState: this.shippingAddressState,
                    shippingAddressZipcode: this.shippingAddressZipcode,
                    instructions: this.instructions,
                };
                this.$store.dispatch('setShippingAddress', formData);
            },
        }
    }
</script>

<style scoped>

</style>