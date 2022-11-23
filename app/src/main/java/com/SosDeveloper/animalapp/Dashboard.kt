package com.SosDeveloper.animalapp

import android.widget.Toast
import androidx.compose.foundation.*
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
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

            title = { Text("        AnimalApp", color = Color.White, fontFamily = FontFamily.Cursive, fontWeight = FontWeight(30)) },
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

                }){
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
                    DropdownMenuItem(onClick = {navController.navigate("About")}) {
                        ClickableText(text = AnnotatedString(text = "About"), onClick = {navController.navigate("About")})

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

    Column(Modifier.padding(top = 60.dp)) {

        Image(
            painter = painterResource(R.drawable.rainbow),
            contentDescription = "Background image",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier

                .height(200.dp)
                .width(600.dp)
                .clip(
                    RoundedCornerShape(1.dp)


                )
        )

    }
    Column(modifier = Modifier.padding(top = 140.dp,start = 50.dp)) {
        Text(
            text = "Welcome to the animals page\n" +
                    "I love animals",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive

        )
        Column (Modifier.padding(top = 20.dp,start = 120.dp)){
            Image(
                painter = painterResource(id = R.drawable.young_leopard_portrait),
                alignment = Alignment.Center,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(70.dp)
                    .width(70.dp)
                    .clip(CircleShape)
            )

        }
    }

    /*
    Column(){
        Text(
            text = "Full development will be out soon.\nSome more little patience.",
            modifier = Modifier.padding(top = 450.dp,start = 130.dp)
        )
        Icon(
            Icons.Filled.Warning,
            "Favorite Icon",
            tint = Color.Cyan,
            modifier = Modifier
                .padding(top = 20.dp, start = 170.dp)
                .size(50.dp)
        )

    }
    */
    Column(modifier= Modifier
        .padding(top = 320.dp)
        .fillMaxSize()
        .verticalScroll(state = ScrollState(1), enabled = true)) {
        Box {
            Row {

                Box(modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, end = 10.dp)
                  ){
                    Image(
                        painter = painterResource(id = R.drawable.dog),
                        contentDescription = "My Dog",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(text = "This is a dog.\nA dog is an animal that is mostly used to provide" +
                            " security to us at home." +
                            " Some dogs are fierce while others are always just cool." +
                            " I love dogs, especially ones that are already trained.",
                    textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp))

                }
            }
            Divider(color = Color.Black, thickness = 1.dp)

            Row {

                Box(modifier = Modifier
                    .padding(top = 130.dp, start = 10.dp, end = 10.dp)
                    ){
                    Image(
                        painter = painterResource(id = R.drawable.chicken),
                        contentDescription = "chicken",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(text = "The chicken is a domesticated jungle-fowl species," +
                            " with attributes of wild species such as the grey" +
                            " and the Ceylon junglefowl that are originally " +
                            "from Southeastern Asia." +
                            "\n Rooster or cock is a term for an adult male bird, " +
                            "and a younger male may be called a cockerel." +
                            " \nA male that has been castrated is a capon",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp))

                }
            }


            Row {
                Box(modifier = Modifier
                    .padding(top = 280.dp, start = 10.dp, end = 10.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.goat),
                        contentDescription = "goat",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(text = "The goat or domestic goat is a domesticated species of " +
                            "goat-antelope typically kept as livestock. " +
                            "\nIt was domesticated from the wild goat of Southwest Asia" +
                            " and Eastern Europe. " +
                            "\nThe goat is a member of the animal family Bovidae" +
                            "and the tribe Caprini, " +
                            "meaning it is closely related to the sheep",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp))

                }
            }

            Row {

                Box(
                    modifier = Modifier
                        .padding(top = 800.dp, start = 10.dp, end = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rainbow),
                        contentDescription = "cat",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(
                        text = "The cat is a domestic species of small carnivorous mammal. " +
                                "\nIt is the only domesticated species in the family Felidae and" +
                                " is commonly referred to as the " +
                                "domestic cat or house cat to distinguish it from the" +
                                " wild members of the family",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp)
                    )

                }
            }
            Row {

                Box(
                    modifier = Modifier
                        .padding(top = 410.dp, start = 10.dp, end = 10.dp)
                        .background(shape = RoundedCornerShape(18.dp), color = Color.Unspecified)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dogggy),
                        contentDescription = "cat",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(
                        text = "The cat is a domestic species of small carnivorous mammal. " +
                                "\nIt is the only domesticated species in the family Felidae and" +
                                " is commonly referred to as the " +
                                "domestic cat or house cat to distinguish it from the" +
                                " wild members of the family",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp)
                    )

                }
            }
            Row {

                Box(
                    modifier = Modifier
                        .padding(top = 540.dp, start = 10.dp, end = 10.dp)
                        .background(shape = RoundedCornerShape(18.dp), color = Color.Unspecified)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dog),
                        contentDescription = "sheep",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(
                        text = "Sheep or domestic sheep are domesticated," +
                                " ruminant mammals typically kept as livestock. " +
                                "\nAlthough the term sheep can apply to other species" +
                                " in the genus Ovis," +
                                " in everyday usage it almost always refers to domesticated sheep. " +
                                "\nLike all ruminants, sheep are members " +
                                "of the order Artiodactyla," +
                                " the even-toed ungulates",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp)
                    )

                }
            }
            Row {

                Box(
                    modifier = Modifier
                        .padding(top = 710.dp, start = 10.dp, end = 10.dp)
                        .background(shape = RoundedCornerShape(18.dp), color = Color.Unspecified)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.goat),
                        contentDescription = "donkey",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Text(
                        text = "The domestic donkey is a hoofed mammal in the family Equidae," +
                                " the same family as the horse. " +
                                "\nIt derives from the African wild ass, Equus africanus," +
                                " and may be classified either as a subspecies thereof, " +
                                "Equus africanus asinus," +
                                " or as a separate species, Equus asinus",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(start = 70.dp)
                    )

                }
            }

        }

        @Composable
        fun BottomBar(navController: NavHostController){
            BottomAppBar(modifier = Modifier.background(color = Color.LightGray)) {
                IconButton(onClick = {navController.navigate("Menu")}) {
                    Icon(
                        Icons.Filled.Home, contentDescription = "Home button",
                        tint = Color.Gray,
                        modifier = Modifier
                            .padding(start = 160.dp)
                            .size(35.dp)
                    )
                }

            }
        }


    }
}

@Preview
@Composable
fun DashboardPreview(){
    Dashboard(navController = rememberNavController())
}
