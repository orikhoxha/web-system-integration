<template xmlns:>
    <div class="days">
        <div class="col-md-1" @click="getDate"  v-bind:class="{active: isActive}">
            <div class="day center-yx" >
                <a>{{ formatDate(date)}}</a>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props: ["date"],

        data() {
            return {
                isActive: false
            }
        },

        methods: {
            /* Format the date to show in the vue component */
            formatDate(date) {
                if(date.dayString === 'Today') return date.dayString;
                return date.dayString + ', ' + date.month+ ' ' + date.dayInt;
            },

            /* Send the date form to the vuex store */
            getDate(){
                this.isActive = true;
                console.log(this.date);
                const formData = {
                    date: this.date.date,
                    dayInt: this.date.dayInt,
                    dayString: this.date.dayString,
                    month: this.date.month
                };
                this.$store.dispatch('setDate', formData);
            }
        }
    }
</script>
<style scoped>
    .active {
        border: 1px solid #8dc63f !important;
    }
</style>
