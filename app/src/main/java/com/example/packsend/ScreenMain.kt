package com.example.packsend

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Register.route) {

        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
        composable(Routes.Register.route) {
            RegisterPage(navController = navController)
        }
        composable(Routes.ForgotPassword.route) {
            ForgotPasswordPage(navHostController = navController)
        }
    }
}