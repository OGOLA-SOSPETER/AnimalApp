package com.SosDeveloper.animalapp

import android.graphics.Paint.Align
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
    Text("  TopMenu", color = Color.Green)
},
backgroundColor = MaterialTheme.colors.background,
navigationIcon = {
    IconButton(onClick = {navController.navigate("Login")}) {
        Icon(Icons.Filled.ArrowBack, null)
    }
}, actions = {
    IconButton(onClick = {navController.navigate("Share" )}) {
        Icon(Icons.Filled.Share, null)
    }
    IconButton(onClick = {navController.navigate("settings") }) {
        Icon(Icons.Filled.Settings, null)
    }
})

Column (modifier=Modifier.padding(top = 70.dp)) {
    OutlinedTextField(
        value = "Ask me anything", onValueChange = {},
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .height(30.dp)
            .padding(8.dp),
        trailingIcon = {
            Icon(
                painter = painterResource(R.drawable.google),
                contentDescription = "Google Search",
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(30.dp)
                    .width(30.dp)
            )
        },

        )
    Text(
        text = "Welcome to my Dashboard",
        textAlign = TextAlign.Center,
        color = Color.Green,
        modifier = Modifier.padding(start = 70.dp, top = 30.dp)

    )

    Text(
        text = "I love Animals",
        color = Color.Green,
        modifier = Modifier.padding(start = 120.dp, top = 10.dp)

    )

    Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(start = 130.dp)) {
        Button(onClick = { navController.navigate("Images") }) {
            Text(
                "Photos",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 10.dp, bottom = 1.dp)
            )

            Image(
                painter = painterResource(R.drawable.rainbow),
                contentDescription = "My Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(top = 10.dp, start = 10.dp)
                    .size(20.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
    }
}
}

@Preview
@Composable
fun PreviewTopMenu(){
    MainContent(navController = rememberNavController())

}