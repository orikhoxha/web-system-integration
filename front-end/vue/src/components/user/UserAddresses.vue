<template>
    <main>
        <div class="account-settings">
            <div class="payment-header">
                <div class="visa-ending float-left">
                    <span class="main">11922 Riverhills Drive, Temple Terrace, FL - 60616</span>
                    <!--<span class="ending">- ending in 1234</span>-->
                </div>
                <div class="card-edit float-right">
                    <a href="" class="btn-load-more" type="button"  data-toggle="modal" data-target=".add-change-address-modal">
                        <i class="fas fa-pencil-alt custom-pencil"></i>
                    </a>
                    <a href="" class="btn-load-more" type="button"  data-toggle="modal" data-target=".remove-address-modal">
                        <i class="fas fa-minus-circle custom-minus"></i>
                    </a>
                    <i class="fas fa-star  custom-star"></i>
                </div>
                <div class="clearfix"></div>
            </div>
            <hr>
            <div class="payment-body text-center">
                <a href="" class="btn-load-more" type="button"  data-toggle="modal" data-target=".add-change-address-modal">New Address</a>
            </div>
        </div>
    </main>
</template>

<script>
    export default {
    }
</script>

<style scoped>

</style>