package com.br.scm.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.br.scm.ui.LoginScreen.LoginScreen
import com.br.scm.ui.RegisterScreen.RegisterScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
) {

    NavHost(
        navController = navController,
        "Login",
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
    ) {
        composable("Login") {
            LoginScreen(
                onNavigateToRegister = { navController.navigate("Register") },
                onContinue = {}
            )
        }
        composable("Register"){ RegisterScreen() }
    }

}