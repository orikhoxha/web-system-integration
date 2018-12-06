<template>
    <div>
        <app-item v-for="item in items" :item="item"></app-item>
    </div>
</template>

<script>
    import Item from './Item.vue';
    export default {

        components: {
            appItem: Item
        },

        /* Get the items from the vuex store */
        computed: {
            items(){
                return this.$store.getters.items;
            }
        }
    }
</script>

<style scoped>
</style>