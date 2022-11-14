package com.SosDeveloper.animalapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

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
        composable("Images"){MyImages(navController)}
        composable("Forgot password"){MyImages(navController)}
        composable("Menu"){ MainContent(navController) }
        composable("settings"){ SettingsPage(navController) }
        composable("About"){AboutApp(navController)}

    }
}