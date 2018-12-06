<template>
    <div>
        <div class="payment-header">
            <div class="visa-ending float-left">
                <span class="main">{{userPayment.type}} {{userPayment.cardNumber}}</span>
                <span class="ending">- ending in {{userPayment.cardNumber}}</span>
            </div>
            <div class="card-edit float-right">
                <a href="" class="btn-load-more" type="button" @click="setSelectedUserPayment"  data-toggle="modal" data-target=".remove-payment-modal">
                    <i class="fas fa-minus-circle custom-minus"></i>
                </a>
                <i class="fas fa-star custom-star"></i>
            </div>
            <div class="clearfix"></div>
            <hr>
        </div>

    </div>

</template>
<script>
    export default {
        props: ['userPayment'],
        methods: {
            setSelectedUserPayment(){
                console.log("User id selected: "  + this.userPayment.id);
                this.$store.dispatch('paymentSelected',this.userPayment.id);
            }
        }
    }

</script>

<style scoped>

</style>