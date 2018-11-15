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
                            <p for="email">orikhoxha@gmail.com</p>
                            <p for="username" class="username-freeze">ohoxha</p>
                            <p for="password">&#8226;&#8226;&#8226;&#8226;&#8226;&#8226;</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="account-labels">
                        <div class="body change">
                            <p for="email"><a href="" type="button" data-toggle="modal" data-target=".change-address-modal">Change</a></p>
                            <p for="username"><a href="">Change</a></p>
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
                            <p for="email">First Name</p>
                            <p for="username">Last Name</p>
                            <p for="password">Phone</p>
                            <p for="password" style="font-weight:bold; color:#8dc63f;"><a href="" type="button" data-toggle="modal" data-target=".change-password-modal">Change</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-md-7">
                    <div class="account-labels">
                        <div class="body inputs">
                            <p for="email">Orik</p>
                            <p for="username">Hoxha</p>
                            <p for="password">708-573-8174</p>
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
                        <h4 class="modal-title custom-title" id="myLargeModalLabel">Large modal</h4>
                    </div>
                    <form action="">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="email" class="form-control" placeholder="Email" id="email">
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
                    <form action="">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="password" class="form-control" placeholder="Password" id="password">
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
                    <form action="">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="password" class="form-control" placeholder="First Name" id="firstName">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="password" class="form-control" placeholder="Last Name" id="lastName">
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group custom-input-modal">
                                        <input type="password" class="form-control" placeholder="Mobile phone number" id="mobilePhoneNumber">
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
    export default {

    }
</script>

<style scoped>

</style>