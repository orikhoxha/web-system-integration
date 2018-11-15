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
                        <li><a href="#"><i class="fas fa-map-marker-alt"></i>&nbsp;&nbsp;Delivery in 3306</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account <span class="caret"></span></a>
                            <ul class="dropdown-menu custom-dropdown">
                                <li><a href="#" class="account-dropdown-name">Hi, <span>Orik</span></a></li>
                                <router-link to="/account" tag="li"><a><i class="far fa-user-circle"></i>&nbsp;&nbspYour Account</a></router-link>
                                <li><a href="#"><i class="fas fa-align-justify"></i>&nbsp;&nbsp;Orders</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#"><i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="jumbotron text-center jumbotron-custom">
            <img src="../assets/logo.png" class="logo-header">
            <form class="form-inline center">
                <div class="input-group text search">
                    <input type="email" class="form-control" size="50" placeholder="Email Address" >
                    <div class="input-group-btn">
                        <button type="button" class="btn btn-danger">Subscribe</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="container-fluid tabs text-center">
            <ul>
                <router-link to="/" tag="li"><a href="#">Home</a></router-link>
                <router-link to="/departments" tag="li"><a href="#">Departments</a></router-link>
                <router-link to="/favourites" tag="li"><a href="#">Favourites</a></router-link>
            </ul>
        </div>
    </div>

</template>

<script>

</script>

<style scoped>

</style>