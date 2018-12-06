<template>
    <main>
        <div class="account-settings">
            <app-customer-address v-for="userShipping in userShippings" :userShipping="userShipping"></app-customer-address>
            <div class="payment-body text-center">
                <a href="" class="btn-load-more" type="button"  data-toggle="modal" data-target=".add-address-modal">New Address</a>
            </div>
        </div>

        <app-add-address-modal></app-add-address-modal>
        <!-- Remove address -->
        <div class="modal fade bs-example-modal-md remove-address-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                        <h4 class="modal-title custom-title" id="myLargeModalLabel">Are you sure you want to remove this address?</h4>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-remove-modal" @click="deleteShipping" >Delete address</button>
                    </div>
                </div>
            </div>
        </div>
    </main>
</template>
<script>
    import CustomerAddress from './CustomerAddress.vue';
    import AddAddressModal from '../../../modals/AddAddressModal.vue';
    export default {

        components: {
            appCustomerAddress: CustomerAddress,
            appAddAddressModal: AddAddressModal
        },

        data(){
            return {
             userShippingStreet1: '',
             userShippingStreet2: '',
             userShippingCity: '',
             userShippingState: '',
             userShippingZipcode: '',
             instructions: '',
             userShippingDefault: false
            }
        },

        beforeCreate(){
            this.$store.dispatch('initShippings');
        },


        methods: {
            onSubmit(){
                const formData = {
                    userShippingStreet1: this.userShippingStreet1,
                    userShippingStreet2: this.userShippingStreet2,
                    userShippingCity: this.userShippingCity,
                    userShippingState: this.userShippingState,
                    userShippingZipcode: this.userShippingZipcode,
                    instructions: this.instructions,
                    userShippingDefault: this.userShippingDefault
                };
                console.log(formData);
                this.$store.dispatch('addShipping',formData);
            },

            deleteShipping() {
                this.$store.dispatch('deleteShipping');
            }
        },

        computed: {
            userShippings(){
                return this.$store.getters.userShippings;
            }
        }
    }
</script>

<style scoped>

</style>