<template>
    <div class="container">
        <div class="row">
            <h3>Reserve a time</h3>
            <div class="checkout-content">
                <div class="deliver">
                    <i class="fas fa-car custom-car"></i>&nbsp;&nbsp;&nbsp;<span class="deliver-to">Delivery to</span>
                </div>
                <div class="address-checkout shadow">
                    <h3>33617 Riverhills Dr</h3>
                    <h3>Tampa, FL 33610</h3>
                    <h3><a href="#" class="change-btn">Change Location</a></h3>
                </div>
                <div class="time-checkout shadow">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="container-fluid">
                                <div class="row">
                                    <app-checkout-date v-for="date in days" :date="date"></app-checkout-date>
                                </div>
                                <div class="row">
                                    <div class="times">
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>q
                                        <div class="col time">
                                            <i class="dot"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle custom-select"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                        <div class="col time">
                                            <i class="far fa-circle"></i>
                                            <span >9am - 10am</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="continue">
                                    <button class="btn btn-continue float-right">Continue</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import CheckoutDate from  './CheckoutDate.vue';
    export default {
        data() {
            return {
                days: [],
                hours: [],
            }
        },

        methods: {
            /* Util */
            setDays() {
                let startDate = new Date();

                for(let i = 0; i < 5; ++i) {
                    let currentDate = new Date();
                    currentDate.setDate(startDate.getDate() + i);

                    let day = currentDate.getDate() === startDate.getDate() ? "Today" : this.getDayString(currentDate.getDay());

                    let currentDateFormatted = this.convertDate(currentDate);
                    let month = currentDate.toLocaleString("en-us", {month: "long"});
                    this.days.push({date: currentDateFormatted, dayString: day, dayInt: currentDate.getDate() , month: month});
                }

                console.log(this.days);
            },

            getDayString(dayNumber) {
                switch(dayNumber){
                    case 0: return "Sunday";
                    case 1: return "Monday";
                    case 2: return "Tuesday";
                    case 3: return "Wednesday";
                    case 4: return "Thursday";
                    case 5: return "Friday";
                    case 6: return "Saturday";
                }
            },

            convertDate(date) {
                return date.toLocaleDateString();
            }
        },


        created() {
            this.setDays()
        },

        components: {
            appCheckoutDate: CheckoutDate
        }
    }
</script>

<style scoped>

</style>