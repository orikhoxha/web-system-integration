<template>
    <div>
        <main>
            <div class="account-settings">
                <div class="col-md-5">
                    <div class="account-labels">
                        <div class="header">
                            <h3>Account Settings</h3>
                        </div>
                        <div class="body">
                            <p for="email">Email</p>
                            <p for="username">Username</p>
                            <p for="password">Password</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-5">
                    <div class="account-labels">
                        <div class="body inputs">
                            <p for="email">{{theUser.email}}</p>
                            <p for="username" class="username-freeze">{{theUser.username}}</p>
                            <p for="password">&#8226;&#8226;&#8226;&#8226;&#8226;&#8226;</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="account-labels">
                        <div class="body change">
                            <p for="email"><a href="" type="button" data-toggle="modal" data-target=".change-address-modal">Change</a></p>
                            <p for="username"><a style="pointer-events:none; cursor: default; color: #e6e6e6" >Change</a></p>
                            <p for="password"><a href="" type="button" data-toggle="modal" data-target=".change-password-modal">Change</a></p>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
                <hr>
                <div class="col-md-5">
                    <div class="account-labels">
                        <div class="header">
                            <h3>Personal Information</h3>
                        </div>
                        <div class="body">
                            <p for="email">Name</p>
                            <p for="password">Phone</p>
                            <p for="password" style="font-weight:bold; color:#8dc63f;"><a href="" type="button" data-toggle="modal" data-target=".change-account-information-modal">Change</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-7">
                    <div class="account-labels">
                        <div class="body inputs">
                            <p for="email">{{theUser.name}}</p>
                            <p for="username">{{theUser.phone}}</p>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <!-- Modal - Change email address -->
        <div class="modal fade bs-example-modal-md change-address-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                        <h4 class="modal-title custom-title" id="myLargeModalLabel">Change Email Address</h4>
                    </div>
                    <form @submit.prevent="onSubmit">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="email" class="form-control" placeholder="Email" id="email" v-model="email">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="email" class="form-control" placeholder="Email Confirmation" id="emailConfirm">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-save-modal">Save changes</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- Modal - Change password -->
        <div class="modal fade bs-example-modal-md change-password-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                        <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                    </div>
                    <form @submit.prevent="onSubmit">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="password" class="form-control" placeholder="Password" id="password" v-model="password">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="password" class="form-control" placeholder="Password Confirmation" id="passwordConfirmation">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-save-modal">Save changes</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- Modal - Edit Account Information -->
        <div class="modal fade bs-example-modal-md change-account-information-modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-md" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                        <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                    </div>
                    <form @submit.prevent="onSubmit">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="text" class="form-control" placeholder="Name" id="name" v-model="name">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="text" class="form-control" placeholder="Phone Number" id="phone" v-model="phone">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-cancel-modal" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-save-modal">Save changes</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import {mapGetters} from 'vuex';
    export default {

        data() {
            return {
                email: '',
                username: '',
                password: '',
                name: '',
                phone: '',
                dataChanged: false
            }
        },

        methods: {
            onSubmit(){
                const formData = {
                    id: this.theUser.id,
                    email: this.email !== '' ? this.email : this.theUser.email,
                    username: this.username !== '' ? this.username : this.theUser.username,
                    password: this.password !== '' ? this.password : this.theUser.password,
                    name: this.name  !== '' ? this.name :  this.theUser.name,
                    phone: this.phone !== '' ? this.phone : this.theUser.phone,
                };

                this.dataChanged = true;

                this.$store.dispatch('updateUserLocal', formData)
            }
        },

        computed: {
            ...mapGetters({
              theUser: 'userLoggedIn'
            })
        },

        beforeRouteLeave(to, from, next){
            if(this.dataChanged){
                this.$store.dispatch('updateUser');
            }
            next();
        }
    }
</script>

<style scoped>

</style>