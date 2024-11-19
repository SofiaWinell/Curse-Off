package com.dsw.pam.curse_off.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dsw.pam.curse_off.view.homepage.HomePage
import com.dsw.pam.curse_off.view.registration.RegistrationScreen
import com.dsw.pam.curse_off.view.wallet.WalletScreen
import com.dsw.pam.settings.view.SettingsScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "registration") {
        composable("registration") {
            RegistrationScreen(
                onRegistrationSuccess = { navController.navigate("home") }
            )
        }
        composable("home") {
            HomePage(
                onLogoutClick = { navController.navigate("registration") },
                onWalletClick = { navController.navigate("wallet") },
            )
        }
        composable("wallet") {
            WalletScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
        composable("settings") {
            SettingsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}