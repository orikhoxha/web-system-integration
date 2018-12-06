<template>
    <div>
        <app-item v-for="item in items" :item="item"></app-item>
    </div>
</template>

<script>
    import Item from './Item.vue';
    export default {

        /* Mockup used to test before the actuall calls on REST API. Not implemented yet. */
        data() {
            return {
                items: [
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"},
                    { id: 1, img: "../../assets/sample_image_2.jpg", price: "3.97", size: "40", description: "Chocolate"}
                ]
            }
        },
        components: {
            appItem: Item
        }
    }
</script>

<style scoped>
</style>