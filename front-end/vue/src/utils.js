export default {


    /* Group the values by key. Used for grouping the departments into main departments */
    groupBy(objectArray, property){
        let accumulate = objectArray.reduce(function(acc, obj){
            let key = obj[property];
            if(!acc[key]){
                acc[key] = [];
            }
            acc[key].push(obj.name);
            return acc;
        }, {});

        let arr = [];

        for(const [key, value] of Object.entries(accumulate)){
            arr.push({name: key, subDepartments: value});
        }
        return arr;
    },


    /* Set the hours for selection on time date */
    setHours() {
        let hours = [];
        let hoursMax = 20;
        let currentHour =  new Date().getHours();
        console.log("currenthour******************"  + currentHour);


        currentHour = currentHour > 9 ? currentHour : 9;

        currentHour =  9;

        for(let i = currentHour; i <= hoursMax; i++) {
            hours.push(i);
        }

        return hours;

    },


    /* Set the days for selection on time date */
    setDays() {
        let days = [];
        let startDate = new Date();
        let maxIteration = 5;

        for (let i = 0; i < maxIteration; ++i) {
            let currentDate = new Date();
            currentDate.setDate(startDate.getDate() + i);

            let day = currentDate.getDate() === startDate.getDate() ? "Today" : this.getDayString(currentDate.getDay());

            if (day === "Today" && startDate.getHours() > 20) {
                maxIteration += 1;
                continue;
            }

            let currentDateFormatted = this.convertDate(currentDate);
            let month = currentDate.toLocaleString("en-us", {month: "long"});
            days.push({date: currentDateFormatted, dayString: day, dayInt: currentDate.getDate(), month: month});
        }

        return days;
    },

    /* Get the day in string */
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
    },

    formatTime(hour) {
        console.log("hour: " + hour);
        return hour + ':00-' + (hour + 1) + ':00';
    },

    convertUnixTime(unixtimestamp){

        // Months array
        const months_arr = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];

        // Convert timestamp to milliseconds
        const date = new Date(unixtimestamp*1000);


        console.log(date);

        // Year
        const year = date.getFullYear();

        // Month
        const month = months_arr[date.getMonth()];

        // Day
        const day = date.getDate();

        // Hours
        const hours = date.getHours();

        // Minutes
        const minutes = "0" + date.getMinutes();

        // Seconds
        const seconds = "0" + date.getSeconds();

        // Display date time in MM-dd-yyyy h:m:s format
        return month+' '+day+', '+year;

    }

}