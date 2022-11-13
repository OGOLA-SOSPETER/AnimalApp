package com.SosDeveloper.animalapp

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun SettingsPage(navController: NavHostController) {
    Column{
        Row (modifier = Modifier.align()){
            Text(text = "This is my settings page.")
        }
    }
    IconButton(
        onClick = { navController.navigate("settings") },
        modifier = Modifier.size(30.dp).padding(top = 150.dp)
    ) {
        Icon(Icons.Filled.Warning, "Error Icon")
    }

    Column(modifier = Modifier.padding(top = 200.dp, start = 50.dp)) {
        Text(text = "OOPS!\n Not yet set..Come later.")
    }
}