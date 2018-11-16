<template>
    <div class="col-md-12">
        <div class="row order-status">
            <div class="col-md-3">
                <h3 class="arrives-by-label">Arrives By</h3>
                <span class="date-time-arrives">Tue, Oct 3  09:00 - 10:00 am</span>
            </div>
            <div class="col-md-9">
                <div class="row">
                    <div class="col-md-3 placed complete">
                        <p>Order Placed</p>
                        <i class="fas fa-circle custom-circle"></i>
                        <span class="custom-line"></span>
                    </div>
                    <div class="col-md-3 processing complete">
                        <p>Processing</p>
                        <i class="fas fa-check-circle custom-check"></i>
                        <span class="custom-line"></span>
                    </div>
                    <div class="col-md-3 shipped processing">
                        <p>Shipped</p>
                        <i class="fas fa-check-circle custom-circle"></i>
                        <span class="custom-line"></span>
                    </div>
                    <div class="col-md-3 pickedUp disabled">
                        <div>
                            <p>Picked Up</p>
                            <i class="fas fa-check-circle custom-circle"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

    export default {
        props: ['orderStatus']
    }
</script>

<style scoped>

</style>