<template>
    <tr>
        <td>{{customer.name}}</td>
        <td>{{customer.email}}</td>
        <td>{{customer.username}}</td>
        <router-link tag="td" v-bind:to="customer.ordersLink"><a>Orders</a></router-link>
        <router-link tag="td" v-bind:to="customer.details"><a>Details</a></router-link>
    </tr>
</template>

<script>
    export default {
        props: ['customer']
    }
</script>

<style scoped>

</style>