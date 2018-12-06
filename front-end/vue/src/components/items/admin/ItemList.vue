<template>
    <main>
        <div class="account-settings">
            <h4><router-link to="/items/newItem"><a>Add new Item</a></router-link></h4>
            <app-item-search></app-item-search>
            <div class="user-list">
                <div class="row">
                    <div class="col-md-12">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th>Title</th>
                                <th>Price</th>
                                <th>Department</th>
                                <th>Details</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr v-for="item in items">
                                <td>{{item.description}}</td>
                                <td>{{item.price}}</td>
                                <td>{{item.department.name}}</td>
                                <router-link :to="{ name: 'itemEdit', params:{id: item.id} }" tag="td"><a>Details</a></router-link>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="load-more text-center">
                <a href="" class="btn-load-more">+ Load More</a>
            </div>
        </div>
    </main>
</template>

<script>
    import ItemSearch from './ItemSearch.vue';
    export default {
        components: {
            appItemSearch: ItemSearch
        },

        /* Get the list of items from the vuex getters */
        computed: {
            items(){
                return this.$store.getters.items;
            }
        }
    }
</script>

<style scoped>

</style>