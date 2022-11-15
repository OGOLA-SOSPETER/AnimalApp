package com.SosDeveloper.animalapp

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SettingsPage(navController: NavHostController) {
    Column(modifier = Modifier.background(color = Color.White)){
        TopAppBar(
            title = {
                Text("MY Settings", color = Color.Black)
                    },
            elevation = 4.dp,
            backgroundColor = Color.Transparent,
            //backgroundColor = MaterialTheme.colors.background,
            navigationIcon = {
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Filled.ArrowBack, null, modifier = Modifier.size(20.dp))
                }
            },
            actions = {
                IconButton(onClick = {navController.navigate("Dashboard") }) {
                }
            }
        )
        }
        Column(modifier = Modifier.padding(top = 140.dp, start = 90.dp)){
            Text(
                text = "This is my settings page.",
                color = Color.Black
            )
        }

    IconButton(
        onClick = { navController.navigate("settings") },

                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(top = 150.dp)

    ) {

    }

    Column(modifier = Modifier.padding(top = 200.dp, start = 100.dp)) {
        Text(
            text = "OOPS!\n Not yet set..Come later.",
            color = Color.Black,
        )
        Icon(
            Icons.Default.Warning,
            contentDescription = "error",
            modifier = Modifier.size(70.dp)

            )
    }
}

@Preview
@Composable
fun SettingsPreview(){
    SettingsPage(navController = rememberNavController())
}