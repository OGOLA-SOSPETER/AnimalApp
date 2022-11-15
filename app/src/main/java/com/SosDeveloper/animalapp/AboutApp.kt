package com.SosDeveloper.animalapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutApp(navController: NavHostController) {

    TopAppBar(
        title = {Text ( "           About Developer")},
        actions = {
            IconButton(onClick = { navController.navigate("Menu") }) {
                Icon(Icons.Filled.ArrowBack, "BackIcon")
            }
        }
    )

    Column(modifier = Modifier.background(color = Color.Transparent), verticalArrangement = Arrangement.Center) {



}

        val myImage = painterResource(id = R.drawable.alx)
Box {
    Column {
        Image(
            painter = myImage,
            contentDescription = "Developer's image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .height(50.dp)
                .width(50.dp)
        )
        Text(
            text = "Android Developer",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 150.dp, top = 50.dp),
            fontSize = 20.sp
        )
    }
}
    }

@Preview
@Composable
fun Preview(){
    AboutApp(navController = rememberNavController())
}

