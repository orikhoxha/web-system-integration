<template>
    <!-- Setup payment -->
    <div class="modal fade bs-example-modal-md change-payment-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
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
                                    <input type="text" class="form-control" placeholder="MM/YY" id="expiryMonthYear" v-model="expiryMonthYear">
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
</template>
<script>
    export default {
        data() {
            return {
                type: 'VISA',
                cardNumber: '',
                expiryMonthYear: '',
                cvc: '',
                holderName: ''
            }
        },
        methods: {
            onSubmit() {
                const formData = {
                    type: this.type,
                    cardNumber: this.cardNumber,
                    expiryMonthYear: this.expiryMonthYear,
                    cvc: this.cvc,
                    holderName: this.holderName
                };
                this.$store.dispatch('setCheckoutPayment', formData);
            },
        }
    }
</script>
