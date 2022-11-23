package com.SosDeveloper.animalapp

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun ShareOptions(navController: NavHostController){
    IconButton(onClick = {navController.navigate("")}) {
        Icon(
            Icons.Default.Share,
            "My share",
            tint = Color.Blue,
        )
        
    }
}