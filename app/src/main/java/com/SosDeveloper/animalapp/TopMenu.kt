package com.SosDeveloper.animalapp

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainContent(navController: NavController) {



// For displaying preview in
// the Android Studio IDE emulator
TopAppBar(
elevation = 4.dp,
title = {
    Text("  Menu- Page", color = Color.White)
},
navigationIcon = {
    IconButton(onClick = {navController.navigate("Dashboard")}) {
        Icon(
            Icons.Filled.ArrowBack,
            null,
            tint = Color.White

        )
    }
}, actions = {
    IconButton(onClick = {navController.navigate("Share" )}) {
        Icon(
            Icons.Filled.Share,
            null,
            tint = Color.White

        )
    }
    IconButton(onClick = {navController.navigate("settings") }) {
        Icon(
            Icons.Filled.Settings,
            null,
            tint = Color.White
        )
    }
})

}

@Preview
@Composable
fun PreviewTopMenu(){
    MainContent(navController = rememberNavController())

}