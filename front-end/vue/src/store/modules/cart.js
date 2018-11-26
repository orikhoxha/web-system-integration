const state = {
    totalItems: 0,
    totalPriceAdded: 0,
    cartItems: []
};


const mutations = {
    'ADD_ITEM_CART'(state, {itemId, quantity, price, description}){
        const record = state.cartItems.find(element => element.id === itemId);
        if(record){
            record.quantity += quantity;
        }else {
            state.cartItems.push({
                id: itemId,
                quantity: quantity,
                description: description,
                price: price,
            })

        }
        state.totalItems += quantity;
        state.totalPriceAdded = state.totalPriceAdded + (quantity * price);
    },
};

const actions = {
    addItemCart({commit}, item) {
        console.log("the item: " + item.description);
        //DepartmentService.postDepartment(department);
        commit('ADD_ITEM_CART', item);
    }
};

const getters = {
    cartItems(state, getters) {
        return state.cartItems.map(item => {
            const record = getters.items.find(element => element.id === item.id);
            return {
                id: item.id,
                quantity: item.quantity,
                name: record.description,
                price: record.price
            }
        })
    },
    totalItems(state) {
        return state.totalItems;
    },

    totalPriceAdded(state){
        return state.totalPriceAdded;
    }
};

export default {
    state,
    mutations,
    actions,
    getters
}