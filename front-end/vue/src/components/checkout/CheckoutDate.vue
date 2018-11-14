<template>
    <div class="days">
        <div class="col-md-1">
            <div class="day center-yx">
                <a>{{ formatDate(date)}}</a>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props: ["date"],

        methods: {
            formatDate(date) {
                if(date.dayString === 'Today') return date.dayString;
                return date.dayString + ', ' + date.month+ ' ' + date.dayInt;
            }
        }
    }

</script>

<style scoped>

</style>