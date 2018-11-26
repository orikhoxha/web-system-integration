<template>
    <!-- Setup payment -->
    <div class="modal fade bs-example-modal-md change-payment-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
        <div class="modal-dialog modal-md" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                </div>
                <form action="">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group custom-input-modal">
                                    <input type="text" class="form-control" placeholder="Email" id="address1">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group custom-input-modal">
                                    <input type="text" class="form-control" placeholder="Phone" id="address2">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group custom-input-modal">
                                    <input type="text" class="form-control" placeholder="Card Number" id="address2">
                                </div>
                            </div>
                        </div>
                        <div class="row border-custom">
                            <div class="col-md-4">
                                <div class="form-group no-border-input">
                                    <input type="text" class="form-control" placeholder="Name on Card" id="address1">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group no-border-input">
                                    <input type="text" class="form-control" placeholder="MM/YY" id="address1">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group no-border-input">
                                    <input type="text" class="form-control" placeholder="CVC" id="address1">
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
        name: "change-payment-modal"
    }
</script>

<style scoped>

</style>