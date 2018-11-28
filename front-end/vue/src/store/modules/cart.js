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
                item: {
                    id: itemId,
                    description: description,
                    price: price,
                }

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
    cartItemList(state, getters) {
        const arrayMap = state.cartItems.map(item => {
            const record = getters.items.find(element => element.id === item.id);
            return {
                quantity: item.quantity,
                item: {
                    id: item.id,
                    description: record.description,
                    price: record.price
                }
            }
        });
        return Array.from(arrayMap.values());
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