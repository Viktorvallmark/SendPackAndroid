package com.example.packsend

sealed class Routes (val route: String){
    object Login: Routes("Login")
    object Register: Routes("Register")

    object ForgotPassword: Routes("ForgotPassword")
}
