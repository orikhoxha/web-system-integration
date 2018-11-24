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
    }
}