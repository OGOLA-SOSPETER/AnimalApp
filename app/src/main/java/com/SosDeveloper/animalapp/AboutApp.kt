package com.SosDeveloper.animalapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun AboutApp(navController: NavHostController) {
    Column(modifier = Modifier.background(color = Color.Transparent), verticalArrangement = Arrangement.Center) {


        val myImage = painterResource(id = R.drawable.alx)
Box {
    Column {
        Image(
            painter = myImage,
            contentDescription = "Developer's image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(CircleShape)
        )
        Text(
            text = "Android Developer",
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}
    }
}