export default {

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
    }


}