<template>
    <div class="payment-header">
        <div class="visa-ending float-left">
            <span class="main">11922 Riverhills Drive, Temple Terrace, FL - 60616</span>
            <!--<span class="ending">- ending in 1234</span>-->
        </div>

        <div class="card-edit float-right">
            <a href="" class="btn-load-more" type="button"  data-toggle="modal" @click="setSelectedUserShipping" data-target=".remove-address-modal">
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
        props: ['userShipping'],
        methods: {
            setSelectedUserShipping(){
                console.log("User id selected: "  + this.userShipping.id);
                this.$store.dispatch('shippingSelected',this.userShipping.id);
            }
        }
    }
</script>
