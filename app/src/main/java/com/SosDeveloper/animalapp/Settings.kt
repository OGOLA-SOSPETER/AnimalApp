package com.SosDeveloper.animalapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SettingsPage(navController: NavHostController) {
    Column{
        TopAppBar(
            title = {Text("")},
            elevation = 4.dp,
            backgroundColor = MaterialTheme.colors.background,
            navigationIcon = {
                IconButton(onClick = { navController.navigate("Dashboard") }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            },
            actions = {
                IconButton(onClick = {navController.navigate("Dashboard") }) {
                }
            }
        )
        }
        Column(modifier = Modifier.padding(top = 140.dp)){
            Text(
                text = "This is my settings page.",
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.None,
            )
        }

    IconButton(
        onClick = { navController.navigate("settings") },

                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(top = 150.dp)
                    .background(color = Color.Red),
    ) {
        Icon(Icons.Filled.Warning, "Error Icon")
    }

    Column(modifier = Modifier.padding(top = 200.dp, start = 50.dp)) {
        Text(
            text = "OOPS!\n Not yet set..Come later.",
        )
    }
}