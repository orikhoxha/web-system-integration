<template>
    <main>
        <div class="account-settings">
            <app-customer-search></app-customer-search>
                <div class="row">
                    <div class="col-md-12">
                        <div class="customer-list">
                            <table class="table table-bordered">
                                <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Email</th>
                                    <th>Username</th>
                                    <th>Orders</th>
                                    <th>Details</th>
                                </tr>
                                </thead>
                                <tbody>
                                <app-customer-row v-for="customer in customers" :customer="customer"></app-customer-row>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        <div class="load-more text-center">
            <a href="" class="btn-load-more">+ Load More</a>
        </div>
    </main>
</template>

<script>
    import CustomerSearch from './CustomerSearch.vue';
    import CustomerRow from './CustomerRow.vue';
    export default {

        data(){
            return {
                customers: [
                    {id: 1, name: 'Orik Hoxha', email: "orikhoxha@gmail.com", username: "Orik", ordersLink: "/account/orders", details: "/account/settings"},
                    {id: 1, name: 'Orik Hoxha', email: "orikhoxha@gmail.com", username: "Orik", ordersLink: "/account/orders", details: "/account/settings"},
                    {id: 1, name: 'Orik Hoxha', email: "orikhoxha@gmail.com", username: "Orik", ordersLink: "/account/orders", details: "/account/settings"},
                    {id: 1, name: 'Orik Hoxha', email: "orikhoxha@gmail.com", username: "Orik", ordersLink: "/account/orders", details: "/account/settings"},
                    {id: 1, name: 'Orik Hoxha', email: "orikhoxha@gmail.com", username: "Orik", ordersLink: "/account/orders", details: "/account/settings"}
                ]
            }
        },
        components: {
            appCustomerSearch: CustomerSearch,
            appCustomerRow: CustomerRow
        }
    }
</script>

<style scoped>

</style>