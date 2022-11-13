package com.SosDeveloper.animalapp

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
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

@Composable
fun MainContent(navController: NavController) {



// For displaying preview in
// the Android Studio IDE emulator
TopAppBar(
elevation = 4.dp,
title = {
    Text("I'm a TopAppBar")
},
backgroundColor = MaterialTheme.colors.background,
navigationIcon = {
    IconButton(onClick = {navController.navigate("Login")}) {
        Icon(Icons.Filled.ArrowBack, null)
    }
}, actions = {
    IconButton(onClick = {/* Do Something*/ }) {
        Icon(Icons.Filled.Share, null)
    }
    IconButton(onClick = {navController.navigate("settings") }) {
        Icon(Icons.Filled.Settings, null)
    }
})

Text("Hello World")


Column {
    OutlinedTextField(
        value = "", onValueChange = {},
        modifier = Modifier
            .background(Color.White, CircleShape).fillMaxWidth()
            .padding(8.dp),
        trailingIcon = {
            Icon(
                painter = painterResource(R.drawable.google),
                contentDescription = "Google Search"
            )
        },

        )
    Text(
        text = "Welcome to my Dashboard",
        textAlign = TextAlign.Center

    )

    Text(text = "I love Animals")


    Button(onClick = { navController.navigate("Images") }) {
        Text(
            "MyImages",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 100.dp, bottom = 1.dp)
        )

        Icon(
            painter = painterResource(R.drawable.google),
            contentDescription = "My Icon",
            modifier = Modifier.align(Alignment.Top)
                .size(70.dp)
                .clip(RoundedCornerShape(16.dp))
        )
    }
}
}