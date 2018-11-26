<template>
    <div class="modal fade bs-example-modal-lg change-time-day-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="checkout-content">
                            <div class="time-checkout">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <app-checkout-date v-for="date in days" :date="date"></app-checkout-date>
                                            </div>
                                            <div class="row">
                                                <div class="times">
                                                    <app-checkout-time v-for="hour in hours" :hour="hour"></app-checkout-time>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-save-modal">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import Utils from '../../utils.js';
    import CheckoutDate from  '../checkout/CheckoutDate.vue';
    import CheckoutTime from '../checkout/CheckoutTime.vue';
    export default {

        data() {
            return {
                days: [],
                hours: [],
            }
        },

        methods: {
            checkoutFinal() {
                this.$router.push('/checkoutFinal');
            },

            /* Util */
            setHours() {
                this.hours = Utils.setHours();

            },

            setDays() {
                this.days = Utils.setDays();
            },
        },

        created() {
            this.setDays();
            this.setHours();
        },

        components: {
            appCheckoutDate: CheckoutDate,
            appCheckoutTime: CheckoutTime,
        }
    }
</script>

<style scoped>

</style>