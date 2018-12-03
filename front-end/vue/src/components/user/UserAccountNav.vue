<template>
    <nav class="sidebar-nav">
        <ul>
            <li><a href="#"><i class="fas fa-align-justify icons-nav"></i>Recent Orders</a></li>
            <router-link  to="/account/orders" tag="li"><a><i class="fas fa-align-justify icons-nav"></i>Your Orders</a></router-link>
            <router-link to="/account/settings" tag="li"><a ><i class="fas fa-cog icons-nav"></i>Account Settings</a></router-link>
            <router-link to="/account/addresses" tag="li"><a><i class="fas fa-map-marker-alt icons-nav"></i>Addresses</a></router-link>
            <router-link to="/account/payments" tag="li"><a><i class="far fa-credit-card icons-nav"></i>Payment methods</a></router-link>
            <router-link to="/account/customers" tag="li"><a><i class="fas fa-users icons-nav"></i>Customers</a></router-link>
            <router-link tag="li" to="/account/items/list" replace><a><i class="fas fa-sitemap icons-nav"></i>Items</a></router-link>
            <router-link tag="li" to="/account/departments/list" replace><a><i class="fas fa-vector-square icons-nav"></i>Departments</a></router-link>
            <li @click="logout" style="cursor: pointer"><a><i class="fas fa-sign-out-alt icons-nav"></i>Log out</a></li>

        </ul>
    </nav>
</template>

<script>
    export default {

        methods: {
            logout(){
                this.$store.dispatch('removeUserLogout');
                this.$router.push("/login");
            }
        }
    }
</script>

<style scoped>

</style>