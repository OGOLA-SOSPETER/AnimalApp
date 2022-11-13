package com.SosDeveloper.animalapp

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun Dashboard(navController: NavHostController) {
    Column(modifier = Modifier.padding(top = 0.dp)) {


        // Create a boolean variable
        // to store the display menu state
        var mDisplayMenu by remember { mutableStateOf(false) }

        // fetching local context
        val mContext = LocalContext.current

        // Creating a Top bar
        TopAppBar(
            title = { Text("DASHBOARD|AnimalApp", color = Color.White) },
            backgroundColor = Color(0xff0f9d58),
            actions = {
// Creating Icon button for dropdown menu
                IconButton(onClick = { mDisplayMenu = !mDisplayMenu }) {
                    Icon(Icons.Default.Menu, "MainMenu")
                }
                // Creating Icon button favorites, on click
                // would create a Toast message
                IconButton(onClick = {
                    Toast.makeText(mContext, "Favorite", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(Icons.Default.Favorite, "")
                }



                // Creating a dropdown menu
                DropdownMenu(
                    expanded = mDisplayMenu,
                    onDismissRequest = { mDisplayMenu = false }
                ) {

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = {navController.navigate("settings")}) {
                        ClickableText(text = AnnotatedString("Settings"), onClick = {navController.navigate("settings")})
                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = {navController.navigate("Login")}){
                        ClickableText(text = AnnotatedString("BackToLogin"), onClick = {navController.navigate("Login")})
                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = {navController.navigate("Images")}) {
                        ClickableText(text = AnnotatedString(text = "PHOTOS"), onClick = {navController.navigate("Images")})

                    }


                    // Creating dropdown menu item, on click
                    // would go to password reset
                    DropdownMenuItem(onClick = {navController.navigate("Forgot password")}) {
                        ClickableText(text = AnnotatedString(text = "Password Reset"), onClick = {navController.navigate("Forgot Password")})

                    }
                }
            }
        )

    }
}
