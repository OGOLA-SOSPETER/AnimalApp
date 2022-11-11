package com.SosDeveloper.animalapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Dashboard(navController: NavController){

    OutlinedTextField(value = "", onValueChange = {},
    modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        trailingIcon = {
            Icon(painter = painterResource(R.drawable.google), contentDescription = "Google Search")
        }

    )
    Text(
        text = "Welcome to my Dashboard",
        textAlign = TextAlign.Center

    )

    Text(text = "I love Animals")


    Button(onClick = {navController.navigate("Images")}) {
        Text(
            "MyImages",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp, bottom = 1.dp)
        )

        Icon(
            painter = painterResource(R.drawable.google),
            contentDescription = "My Icon",
            modifier = Modifier.align(Top)
                .size(70.dp)
                .clip(RoundedCornerShape(16.dp))
        )
    }
    }
