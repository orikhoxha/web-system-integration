<template>
    <div class="col time">
        <i class="far fa-circle"></i>
        <span >{{formatTime(hour)}}</span>
    </div>

</template>

<script>
    export default {
        props: ['hour'],

        methods: {
            formatTime(hour) {
                return hour + ':00- ' + (hour + 1) + ':00';
            }
        }
    }
</script>

<style scoped>

</style>