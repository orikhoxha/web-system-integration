<template>
    <div>
        <nav class="navbar navbar-default custom">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle btn-custom-bg" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#" type="button"  data-toggle="modal" data-target=".add-change-address-modal"><i class="fas fa-map-marker-alt"></i>&nbsp;&nbsp;Delivery in 3306</a></li>
                        <li class="dropdown" v-if="userLoggedIn">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account <span class="caret"></span></a>
                            <ul class="dropdown-menu custom-dropdown">
                                <li><a href="#" class="account-dropdown-name">Hi, <span>{{userLoggedIn.username}}</span></a></li>
                                <router-link to="/account" tag="li"><a><i class="far fa-user-circle"></i>&nbsp;&nbspYour Account</a></router-link>
                                <router-link to="/account/orders" tag="li"><a><i class="fas fa-align-justify"></i>&nbsp;&nbsp;Orders</a></router-link>
                                <li role="separator" class="divider"></li>
                                <li @click="logout"><a ><i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Logout</a></li>
                            </ul>
                        </li>
                        <router-link tag="li" to="/login" v-else><a><i class="fas fa-sign-in-alt"></i>&nbsp;&nbsp;Sign into your account</a></router-link>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="jumbotron text-center jumbotron-custom">
            <img src="../assets/logo.png" class="logo-header">
            <form class="form-inline center">
                <div class="input-group text search">
                    <input type="email" class="form-control" size="50" placeholder="Enter Item" >
                    <div class="input-group-btn">
                        <button type="button" class="btn btn-danger">Search</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="container-fluid tabs text-center">
            <ul>
                <router-link to="/" tag="li" @click="console.log('clicked')"><a href="#">Home</a></router-link>
                <router-link to="/departments" tag="li"><a href="#">Departments</a></router-link>
                <router-link to="/favourites" tag="li"><a href="#">Favourites</a></router-link>
            </ul>
        </div>

        <!-- Change address modal -->
        <app-change-address-modal></app-change-address-modal>
    </div>

</template>

<script>
    import ChangeAddressModal from './modals/ChangeAddressModal.vue';
    export default {
        components: {
            appChangeAddressModal: ChangeAddressModal
        },

        /* Get user logged in */
        computed: {
            userLoggedIn() {
                return this.$store.getters.userLoggedIn;
            }
        },

        /* Call the logout from the vuex store. Sets the user loggedin to null or undefined */
        methods: {
            logout(){
                this.$store.dispatch('removeUserLogout');
                this.$router.push("/login");
            }
        }
    }
</script>