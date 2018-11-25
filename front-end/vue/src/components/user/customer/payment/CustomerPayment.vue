<template>
    <div class="payment-header">
        <div class="visa-ending float-left">
            <span class="main">{{customerPayment.type}} {{customerPayment.cardNumber}}</span>
            <span class="ending">- ending in {{customerPayment.cardNumberEnding}}</span>
        </div>
        <div class="card-edit float-right">
            <a href="" class="btn-load-more" type="button"  data-toggle="modal" data-target=".remove-payment-modal">
                <i class="fas fa-minus-circle custom-minus"></i>
            </a>
            <i class="fas fa-star  custom-star"></i>
        </div>
        <div class="clearfix"></div>
        <hr>
    </div>
</template>

<script>
    export default {
        props: ['customerPayment']
    }

</script>

<style scoped>

</style>