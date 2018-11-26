<template>
    <div>
        <div class="container">
            <div class="row">
                <div class="col-md-9">
                    <div class="row payment-change">
                        <div class="col">
                            <div class="change float-right">
                                <button type="button" class="btn change-info" data-toggle="modal" data-target=".change-time-day-modal">Change</button>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="col-md-4">
                            <i class="fas fa-check-circle custom-check"></i>
                            <div class="head-info">
                                <span class="content-header">Shipping</span>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <span>Arrives</span>
                            <span>Wed, {{checkoutDate.month}}  {{ checkoutDate.dayInt}} between {{checkoutTime}} pm</span>
                        </div>
                    </div>
                    <div class="row payment-change">
                        <div class="col-md-4">
                            <i class="fas fa-check-circle custom-check"></i>
                            <div class="head-info">
                                <span class="content-header">Sending to</span>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <span>Arrives</span>
                            <span>{{checkoutAddress.shippingAddressName}}, {{checkoutAddress.shippingAddressState}}, {{checkoutAddress.shippingAddressZipcode}}</span>
                        </div>
                    </div>
                    <div class="row payment-change">
                        <div class="col">
                            <div class="change float-right">
                                <button class="btn change-info" data-toggle="modal" data-target=".change-payment-modal">Set Payment</button>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="col-md-4">
                            <i class="fas fa-check-circle custom-check"></i>
                            <div class="head-info">
                                <span class="content-header">Paying with</span>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="col-md-4 text-right">
                                <span>Visa</span>
                            </div>
                            <div class="col-md-8">
                                <span>ending in 1234</span>
                            </div>
                            <div class="col-md-4 text-right">
                                <span>Name on Card</span>
                            </div>
                            <div class="col-md-8">
                                <span>ending in 1234</span>
                            </div>
                            <div class="col-md-4 text-right">
                                <span>Expiring</span>
                            </div>
                            <div class="col-md-8">
                                <span>ending in 1234</span>
                            </div>
                            <div class="col-md-4 text-right">
                                <span>Phone</span>
                            </div>
                            <div class="col-md-8">
                                <span>ending in 1234</span>
                            </div>
                            <div class="col-md-4 text-right">
                                <span>Phone</span>
                            </div>
                            <div class="col-md-8">
                                <span>ending in 1234</span>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="col-md-3 shadow">
                    <div class="row">
                        <div class="payment-info-checkout">
                            <div class="col-md-6">
                                <span class="label-payment">Subtotal</span>
                            </div>
                            <div class="col-md-6 text-right">
                                <span class="value">6$</span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="payment-info-checkout">
                            <div class="col-md-6">
                                <span class="label-payment">Value Shipping</span>
                            </div>
                            <div class="col-md-6 text-right">
                                <span class="value">6$</span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="payment-info-checkout">
                            <div class="col-md-6">
                                <span class="label-payment">Subtotal</span>
                            </div>
                            <div class="col-md-6 text-right">
                                <span class="value">6$</span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="payment-info-checkout">
                            <div class="col-md-6">
                                <span class="label-payment">Est. tax</span>
                            </div>
                            <div class="col-md-6 text-right">
                                <span class="value">6$</span>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="payment-info-checkout">
                            <div class="col-md-6">
                                <span class="label-payment estimate">Est. total</span>
                            </div>
                            <div class="col-md-6 text-right">
                                <span class="value price">$6</span>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="articles-overview">
                            <div class="col-md-4">
                                <div class="image-container">
                                    <div class="article-image">
                                        <img src="../../assets/sample_image.jpg" alt="" >
                                    </div>
                                    <span class="image-quantity">3</span>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <p class="article-description">Vanity Fair Every Day Paper Napkins</p>
                            </div>
                            <div class="col-md-4"><span class="article-price">$15</span></div>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="articles-overview">
                            <div class="col-md-4">
                                <div class="image-container">
                                    <div class="article-image">
                                        <img src="../../assets/sample_image.jpg" alt="" >
                                    </div>
                                    <span class="image-quantity">3</span>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <p class="article-description">Vanity Fair Every Day Paper Napkins</p>
                            </div>
                            <div class="col-md-4"><span class="article-price">$15</span></div>
                        </div>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="articles-overview">
                            <div class="col-md-4">
                                <div class="image-container">
                                    <div class="article-image">
                                        <img src="../../assets/sample_image.jpg" alt="" >
                                    </div>
                                    <span class="image-quantity">3</span>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <p class="article-description">Vanity Fair Every Day Paper Napkins</p>
                            </div>
                            <div class="col-md-4"><span class="article-price">$15</span></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container footer">
            <div class="row">
                <div class="col-md-6 account-info">
                    <p>Have an Account? Please <a href="">log in</a></p>
                    <p>Want to have an account? Please <a href="">register</a></p>
                </div>
                <div class="col-md-6 text-right">
                    <button class="btn btn-continue">Place Order</button>
                </div>
            </div>
        </div>

        <!-- Modals -->
        <app-change-time-modal></app-change-time-modal>
        <!-- Change time, day -->



    </div>
</template>

<script>
    import {mapGetters} from 'vuex';
    import ChangeTimeModal from '../modals/ChangeTimeModal.vue';
    export default {
        computed: {
            ...mapGetters({
                checkoutDate: 'checkoutDate',
                checkoutTime: 'checkoutTime',
                checkoutAddress: 'checkoutShippingAddress'
            })
        },

        components: {
            appChangeTimeModal: ChangeTimeModal
        }
    }
</script>

<style scoped>

</style>