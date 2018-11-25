<template>
    <div class="container">
        <div class="row">
            <h3>Reserve a time</h3>
            <div class="checkout-content">
                <div class="deliver">
                    <i class="fas fa-car custom-car"></i>&nbsp;&nbsp;&nbsp;<span class="deliver-to">Delivery to</span>
                </div>
                <div class="address-checkout shadow">
                    <h3>{{shippingAddress.shippingAddressName}}</h3>
                    <h3>{{shippingAddress.shippingAddressCity}}, {{shippingAddress.shippingAddressState}} {{shippingAddress.shippingAddressZipcode}}</h3>
                    <!--<h3><a href="#" class="change-btn" type="button"  data-toggle="modal" data-target=".add-change-address-modal">Change Location</a></h3>-->
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
                                        <app-checkout-time v-for="hour in hours" :hour="hour"></app-checkout-time>
                                    </div>
                                </div>
                                <div class="continue">
                                    <button class="btn btn-continue float-right" @click="checkoutFinal()">Continue</button>
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
    import CheckoutTime from './CheckoutTime.vue';
    import ChangeAddressModal from '../modals/ChangeAddressModal.vue';

    export default {
        data() {
            return {
                days: [],
                hours: [],
            }
        },

        computed: {
            shippingAddress(){
                return this.$store.getters.checkoutShippingAddress;
            }
        },

        methods: {
            checkoutFinal() {
                this.$router.push('/checkoutFinal');
            },

            /* Util */
            setHours() {
                let hoursMax = 20;
                let currentHour =  new Date().getHours();
                console.log("currenthour******************"  + currentHour);


                currentHour = currentHour > 9 ? currentHour : 9;

                currentHour =  9;

                for(let i = currentHour; i <= hoursMax; i++) {
                    this.hours.push(i);
                }

            },

            setDays() {
                let startDate = new Date();
                let maxIteration  = 5;

                for(let i = 0; i < maxIteration; ++i) {
                    let currentDate = new Date();
                    currentDate.setDate(startDate.getDate() + i);

                    let day = currentDate.getDate() === startDate.getDate() ? "Today" : this.getDayString(currentDate.getDay());

                    if (day === "Today" && startDate.getHours() > 20) {
                        maxIteration += 1;
                        continue;
                    }

                    let currentDateFormatted = this.convertDate(currentDate);
                    let month = currentDate.toLocaleString("en-us", {month: "long"});
                    this.days.push({date: currentDateFormatted, dayString: day, dayInt: currentDate.getDate() , month: month});
                }

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
            this.setDays();
            this.setHours();
        },

        components: {
            appCheckoutDate: CheckoutDate,
            appCheckoutTime: CheckoutTime,
            appChangeAddressModal: ChangeAddressModal
        }
    }
</script>

<style scoped>

</style>