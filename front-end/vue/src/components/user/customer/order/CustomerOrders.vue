<template>
    <main>
        <div class="orders">
            <app-customer-order v-for="order in customerOrders" :order="order"></app-customer-order>
        </div>
    </main>
</template>

<script>
    import CustomerOrder from './CustomerOrder.vue';
    export default {

        data() {
            return {
                customerOrders: [
                    {date: "Oct 7, 2018", items: [
                            {quantity: 3, title: "VanityFair", img: "../../../../assets/sample_image.jpg"},
                            {quantity: 4, title: "VanityFair", img: "../../../../assets/sample_image.jpg"},
                            {quantity: 2, title: "VanityFair", img: "../../../../assets/sample_image.jpg"},
                            {quantity: 2, title: "VanityFair", img: "../../../../assets/sample_image.jpg"}
                        ],
                    priceDetails: { subtotal: 39.3, valueShipping: 39.2, estTax: 3.5, total: 39.3}
                    },
                    {date: "Oct 5, 2018", items: [
                            {quantity: 3, title: "VanityFair", img: "../../../../assets/sample_image.jpg"},
                            {quantity: 4, title: "VanityFair", img: "../../../../assets/sample_image.jpg"},
                            {quantity: 2, title: "VanityFair", img: "../../../../assets/sample_image.jpg"},
                        ],
                        priceDetails: { subtotal: 39.3, valueShipping: 39.2, estTax: 3.5, total: 39.3}
                    }

                ]
            }
        },

        components: {
            appCustomerOrder: CustomerOrder
        }

    }
</script>

<style scoped>

</style>