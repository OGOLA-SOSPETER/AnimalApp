package com.SosDeveloper.animalapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.osDeveloper.animalapp.AboutApp

@Composable
fun AnimalNavigation(navController: NavHostController){
    NavHost(navController = navController,
    startDestination = "Login"
        ){
        //Login
        //Dashboard
        //Setting
        composable("Login"){ LoginUI(navController) }
        composable("Dashboard"){ Dashboard(navController) }
        composable("Forgot password"){ PasswordReset(navController) }
        composable("Menu"){ MainContent(navController) }
        composable("settings"){ SettingsPage(navController) }
        composable("About"){ AboutApp(navController )}
        composable("Share"){ ShareOptions(navController) }
        composable("Registration"){ Registration(navController) }

    }
}