<template>
    <main>
        <div>
            <div class="account-settings">
                <appUserPayment v-for="userPayment in userPayments" :userPayment="userPayment"></appUserPayment>
                <div class="payment-body text-center">
                    <a href="" class="btn-load-more" type="button"  data-toggle="modal" data-target=".add-payment-modal">New Card</a>
                </div>
            </div>
            <!-- Add payment -->
            <div class="modal fade bs-example-modal-md add-payment-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                <div class="modal-dialog modal-md" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                            <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                        </div>
                        <form @submit.prevent="onSubmit">
                            <div class="modal-body">

                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group custom-input-modal">
                                            <input type="text" class="form-control" placeholder="Card Number" id="cardNumber" v-model="cardNumber">
                                        </div>
                                    </div>
                                </div>
                                <div class="row border-custom">
                                    <div class="col-md-4">
                                        <div class="form-group no-border-input">
                                            <input type="text" class="form-control" placeholder="Name on Card" id="holderName" v-model="holderName">
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group no-border-input">
                                            <input type="text" class="form-control" placeholder="MM/YY" id="expiryDate" v-model="expiryDate">
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group no-border-input">
                                            <input type="text" class="form-control" placeholder="CVC" id="cvc" v-model="cvc">
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

            <!-- Remove payment -->
            <div class="modal fade bs-example-modal-md remove-payment-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                <div class="modal-dialog modal-md" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                            <h4 class="modal-title custom-title" id="myLargeModalLabel">Are you sure you want to remove this payment?</h4>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-remove-modal" @click="deletePayment">Delete payment</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</template>

<script>
    import CustomerPayment from './CustomerPayment.vue';
    export default {
        components: {
                appUserPayment: CustomerPayment
        },


        /* Initialize form data for card */
        data(){
            return {
                cardNumber: '',
                holderName: '',
                expiryDate: '',
                cvc: ''
            }
        },


        /* Get all payments from the vuex store before the vue component is created */
        beforeCreate(){
            this.$store.dispatch('initPayments');
        },

        computed: {
            userPayments(){
                return this.$store.getters.userPayments;
            }
        },

        /* Prevent default submit. Add the payment to the vuex store */
        methods: {
            onSubmit(){
                const formData = {
                    type: "VISA",
                    cardNumber: this.cardNumber,
                    expiryDate: this.expiryDate,
                    cvc: this.cvc,
                    holderName: this.holderName,
                };
                console.log(formData);
                this.$store.dispatch('addPayment',formData);
            },

            deletePayment() {
                this.$store.dispatch('deletePayment');
            }
        }
    }
</script>

<style scoped>

</style>