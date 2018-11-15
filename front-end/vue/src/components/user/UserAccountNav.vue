<template>
    <nav class="sidebar-nav">
        <ul>
            <li><a href="#"><i class="fas fa-align-justify icons-nav"></i>Recent Orders</a></li>
            <router-link  to="/account/orders" tag="li"><a><i class="fas fa-align-justify icons-nav"></i>Your Orders</a></router-link>
            <router-link to="/account/settings" tag="li"><a ><i class="fas fa-cog icons-nav"></i>Account Settings</a></router-link>
            <router-link to="/account/addresses" tag="li"><a><i class="fas fa-map-marker-alt icons-nav"></i>Addresses</a></router-link>
            <li><a href="#"><i class="far fa-credit-card icons-nav"></i>Payment methods</a></li>
            <li><a href="#"><i class="fas fa-sign-out-alt icons-nav"></i>Log out</a></li>
        </ul>
    </nav>
</template>

<script>
    export default {
    }
</script>

<style scoped>

</style>