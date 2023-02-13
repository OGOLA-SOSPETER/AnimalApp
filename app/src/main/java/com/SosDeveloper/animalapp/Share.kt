package com.SosDeveloper.animalapp

import android.widget.GridLayout.Alignment
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ShareOptions(navController: NavHostController){
    Column() {


        TopAppBar() {
            IconButton(onClick = { navController.navigate("Menu") }) {
                Icon(
                    Icons.Filled.ArrowBack,
                    contentDescription = null
                )
            }
            Text(
                text = "SharePoint",
            textAlign = Center,
                modifier = Modifier.padding(start = 50.dp)
                )
            IconButton(onClick = { navController.navigate("Menu") }) {
                Icon(
                    Icons.Default.Share,
                    "My share",
                    tint = Color.White,
                    modifier = Modifier.padding(start = 150.dp)
                )

            }
        }


    }
}

@Preview
@Composable
fun SharePreview(){
    ShareOptions(navController = rememberNavController())
}