<template>
    <div class="filters">
        <div class="row">
            <div class="col-md-12">
                <div class="customer-list">
                    <div class="header">
                        <h3>Product List</h3>
                    </div>
                    <div class="filters-input">
                        <form class="form-inline">
                            <div class="form-group">
                                <input type="email" class="form-control" id="email" placeholder="Enter email"  name="email">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="pwd" placeholder="First or Last Name" name="pwd">
                            </div>
                            <div class="form-group">
                                <select class="form-control" id="sel1">
                                    <option>Chicken</option>
                                    <option>Beef</option>
                                    <option>Mackyes</option>
                                    <option>Lackyer</option>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-default custom-btn-search">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "item-search"
    }
</script>

<style scoped>

</style>