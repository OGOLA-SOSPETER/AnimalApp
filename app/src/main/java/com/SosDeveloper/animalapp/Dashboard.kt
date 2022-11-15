package com.SosDeveloper.animalapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.animalapp.ui.theme.Shapes

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
            title = { Text("        AnimalApp", color = Color.Black) },
            backgroundColor = Color.White,
            actions = {
// Creating Icon button for dropdown menu
                IconButton(onClick = { mDisplayMenu = !mDisplayMenu }) {
                    Icon(Icons.Default.Menu, "MainMenu")
                }
                // Creating Icon button favorites, on click
                // would create a Toast message
                IconButton(onClick = {
                    Toast.makeText(mContext, "Favorite", Toast.LENGTH_SHORT).show()
                }){
                    Icon(
                        Icons.Default.Favorite,
                        "Favorite Icon",
                        modifier = Modifier.pointerHoverIcon(icon = PointerIcon(4))
                    )
                }



                // Creating a dropdown menu
                DropdownMenu(
                    expanded = mDisplayMenu,
                    onDismissRequest = { mDisplayMenu = true }
                ) {



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
                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = {navController.navigate("Images")}) {
                        ClickableText(text = AnnotatedString(text = "ABOUT"), onClick = {navController.navigate("About")})

                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = {navController.navigate("settings")}) {
                        ClickableText(text = AnnotatedString("Settings"), onClick = {navController.navigate("settings")})
                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = {navController.navigate("Login")}){
                        ClickableText(text = AnnotatedString("Logout"), onClick = {navController.navigate("Login")})
                    }

                }
            }
        )

    }
    Column(Modifier.padding(top = 100.dp)) {
        Image(
            painter = painterResource(R.drawable.leopard),
            modifier = Modifier.height(200.dp).fillMaxWidth(),
            contentDescription = "Background image"
        )
        Text(text = AnnotatedString("Welcome to the animals page\n\nI love animals"))
    }
Column (Modifier.padding(top = 200.dp)){
    Image(
        painter = painterResource(id = R.drawable.dog),
        alignment = Alignment.Center,
        contentDescription = "my dog",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(70.dp)
            .width(70.dp)
            .clip(CircleShape)
            .padding(all = 5.dp)
    )
}
}
@Preview
@Composable
fun DashboardPreview(){
    Dashboard(navController = rememberNavController())
}
