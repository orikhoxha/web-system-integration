const state = {
    totalItems: 0,
    totalPriceAdded: 0,
    cartItems: []
};


const mutations = {
    'ADD_ITEM_CART'(state, {itemId, quantity, price}){
        const record = state.cartItems.find(element => element.id === itemId.id);

        if(record){
            record.quantity += quantity;
        }else {
            state.cartItems.push({
                id: itemId,
                quantity: quantity,
                price: price
            })
        }
        state.totalItems += quantity;
        //state.totalPriceAdded += record.quantity * record.price;
    },
};

const actions = {
    addItemCart({commit}, item) {
        console.log(item);
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
    }
};

export default {
    state,
    mutations,
    actions,
    getters
}