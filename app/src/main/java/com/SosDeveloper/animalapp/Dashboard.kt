package com.SosDeveloper.animalapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

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

            title = {
                Text(
                    "        AnimalApp",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight(30)
                )
            },
            backgroundColor = Color.Blue,
            actions = {
// Creating Icon button for dropdown menu
                IconButton(onClick = { mDisplayMenu = !mDisplayMenu }) {
                    Icon(Icons.Default.Menu, "MainMenu", tint = Color.White)
                }
                // Creating Icon button favorites, on click
                // would create a Toast message
                IconButton(onClick = {
                    Toast.makeText(mContext, "Favorite", Toast.LENGTH_SHORT).show()

                }) {
                    Icon(
                        Icons.Default.Favorite,
                        "Favorite Icon",
                        tint = Color.Red,
                    )
                }


                // Creating a dropdown menu
                DropdownMenu(
                    expanded = mDisplayMenu,
                    onDismissRequest = { mDisplayMenu = true }
                ) {


                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = { navController.navigate("Domestic") }) {
                        ClickableText(
                            text = AnnotatedString(text = "DOMESTIC-ANIMALS"),
                            onClick = { navController.navigate("Domestic") })

                    }
                    DropdownMenuItem(onClick = { navController.navigate("WildAnim") }) {
                        ClickableText(
                            text = AnnotatedString(text = "WILD-ANIMALS"),
                            onClick = { navController.navigate("WildAnim") })

                    }

                    // Creating dropdown menu item, on click
                    // would go to password reset
                    DropdownMenuItem(onClick = { navController.navigate("Forgot password") }) {
                        ClickableText(
                            text = AnnotatedString(text = "Password Reset"),
                            onClick = { navController.navigate("Forgot Password") })

                    }
                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = { navController.navigate("About") }) {
                        ClickableText(
                            text = AnnotatedString(text = "About"),
                            onClick = { navController.navigate("About") })

                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = { navController.navigate("settings") }) {
                        ClickableText(
                            text = AnnotatedString("Settings"),
                            onClick = { navController.navigate("settings") })
                    }
                    DropdownMenuItem(onClick = { navController.navigate("Privacy Policy") }) {
                        ClickableText(
                            text = AnnotatedString("Privacy Policy"),
                            onClick = { navController.navigate("Privacy Policy") })
                    }
                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    DropdownMenuItem(onClick = { navController.navigate("Login") }) {
                        ClickableText(
                            text = AnnotatedString("Logout"),
                            onClick = { navController.navigate("Login") })
                    }

                }
            }
        )
        Box {
            Image(
                painter = painterResource(id = R.drawable.zebra1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 700.dp, height = 200.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 0.dp,
                            topEnd = 0.dp,
                            bottomStart = 50.dp,
                            bottomEnd = 50.dp
                        )
                    )
            )
            Column(modifier=Modifier) {
                Row(modifier = Modifier.padding(start = 260.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.chicken),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row (modifier = Modifier.padding(start = 310.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.goat),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row (modifier = Modifier.padding(start = 260.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.cats),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                }
}


        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(Modifier.verticalScroll(state = ScrollState(3), enabled = true)) {

            Text(
                text = "The Rhino",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {

                item {
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.rhino),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )

                            Text(text = "Rhinoceros", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                items(2) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.rhinoos),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )

                            Text(text = "Rhinoceroses", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                items(2) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.rhino),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )

                            Text(text = "Rhinoceros", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }
            Text(
                text = "The Dog",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                item {
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.dog),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Dog", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                items(4) { index ->
                    Box{
                        Column{
                            Image(
                        painter = painterResource(id = R.drawable.dogggy),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = RoundedCornerShape(4.dp))

                    )
                    Text(text = "German Shepherd", modifier = Modifier.padding(start =10.dp))
                }
            }
                }
            }

            Text(
                text = "The Lion",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.lionn),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Lion", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                items(3) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.lion),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Lionesses", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {
                        }
                        Image(
                            painter = painterResource(id = R.drawable.lioon),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(shape = RoundedCornerShape(4.dp))

                        )
                        Text(text = "Lion", modifier = Modifier.padding(start = 10.dp))
                    }
                }
            }


            Text(
                text = "The Zebra",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                items(5) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.zebra1),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Zebra", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }

            Text(
                text = "The Antelope",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                items(5) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.antellops),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Antelope", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }

            Text(
                text = "The Elephant",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.elephantt),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Elephant", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.elephant),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(
                                text = "Elephants drinking water",
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.elephant1),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Elephants", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }

                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.elephant2),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Elephants", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }

                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.elephantst),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Elephants", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }

            Text(
                text = "The Buffalo",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                items(5) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.buffalo),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Buffalos", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }

            Text(
                text = "The Leopard",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.leopard1),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(
                                text = "Leopard on a tree",
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.leopard),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Leopard", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.leopard1),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Leopard", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.leopard2),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Leopard", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.leopard2),
                                contentDescription = null,
                                Modifier.size(110.dp)
                            )
                            Text(text = "Leopard view", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }

            Text(
                text = "The Giraffe",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                item {
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.giraffe),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Giraffe", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.giraffe1),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Giraffe", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.giraffes),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Giraffe", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
                item {
                    Box {
                        Column {

                            Image(
                                painter = painterResource(id = R.drawable.giraffe),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Giraffe", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }
            Text(
                text = "The Antezelle😂😂",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                items(5) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.mh),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Antezelle", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }
            Text(
                text = "The Monkey",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Gray
            )
            LazyRow(
                modifier = Modifier.padding(start = 7.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp)

            ) {
                items(5) { index ->
                    Box {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.monkey),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(100.dp)
                                    .clip(shape = RoundedCornerShape(4.dp))

                            )
                            Text(text = "Monkey", modifier = Modifier.padding(start = 10.dp))
                        }
                    }
                }
            }
        }
            PhotoGrid()

    }

}
@Composable
fun PhotoGrid() {
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 100.dp),
        modifier = Modifier.padding(7.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    )
    {
        items(20) {
            Image(
                painter = painterResource(id = R.drawable.zebra),
                contentDescription = "dev"
            )
            Image(
                painter = painterResource(id = R.drawable.monkey),
                contentDescription = "goat"
            )
            Text("Goat", fontSize = 30.sp)
            Image(
                painter = painterResource(id = R.drawable.rhino),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.antellops),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.giraffe),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )
            Image(
                painter = painterResource(id = R.drawable.goat),
                contentDescription = "goat"
            )

        }
    }
}

@Preview
@Composable
fun DashboardPreview(){
    Dashboard(navController = rememberNavController())
}
