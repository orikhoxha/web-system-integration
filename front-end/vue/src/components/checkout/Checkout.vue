<template>
    <div class="container">
        <div class="row">
            <h3>Reserve a time</h3>
            <div class="checkout-content">
                <div class="deliver">
                    <i class="fas fa-car custom-car"></i>&nbsp;&nbsp;&nbsp;<span class="deliver-to">Delivery to</span>
                </div>
                <div class="address-checkout shadow">
                    <h3>{{shippingAddress.shippingAddressName}}</h3>
                    <h3>{{shippingAddress.shippingAddressCity}}, {{shippingAddress.shippingAddressState}} {{shippingAddress.shippingAddressZipcode}}</h3>
                    <!--<h3><a href="#" class="change-btn" type="button"  data-toggle="modal" data-target=".add-change-address-modal">Change Location</a></h3>-->
                </div>
                <div class="time-checkout shadow">
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
                                <div class="continue">
                                    <button class="btn btn-continue float-right" @click="checkoutFinal()">Continue</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import CheckoutDate from  './CheckoutDate.vue';
    import CheckoutTime from './CheckoutTime.vue';
    import ChangeAddressModal from '../modals/ChangeAddressModal.vue';
    import Utils from '../../utils.js';


    export default {

        /* days, hours array initialized */
        data() {
            return {
                days: [],
                hours: [],
            }
        },

        /* Get shipping address from the vuex getter */
        computed: {
            shippingAddress(){
                return this.$store.getters.checkoutShippingAddress;
            }
        },

        methods: {
            /* Go to the checkoutfinal router */
            checkoutFinal() {
                this.$router.push('/checkoutFinal');
            },


            /*Set hours and days */
            /* Util */
            setHours() {
                this.hours = Utils.setHours();

            },

            setDays() {
                this.days = Utils.setDays();
            },
        },


        /* Call methods when component mounted */
        created() {
            this.setDays();
            this.setHours();
        },


        /*Included components */
        components: {
            appCheckoutDate: CheckoutDate,
            appCheckoutTime: CheckoutTime,
            appChangeAddressModal: ChangeAddressModal
        }
    }
</script>

<style scoped>

</style>