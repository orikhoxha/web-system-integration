<template>
    <div class="col time" @click="getTime" v-bind:class="{active: isActive}">
        <i class="far fa-circle"></i>
        <span >{{formatTime(hour)}}</span>
    </div>
</template>

<script>
    export default {
        props: ['hour'],

        data() {
            return {
                isActive: false
            }
        },

        methods: {
            formatTime(hour) {
                console.log("hour: " + hour);
                return hour + ':00-' + (hour + 1) + ':00';
            },

            getTime(){
                this.isActive = true;
                console.log(this.hour);
                const hourFormatted = this.formatTime(this.hour);
                this.$store.dispatch('setTime', hourFormatted);
            }
        }
    }
</script>

<style scoped>
    .active{
        border: 2px solid #8dc63f;
    }
</style>