package com.SosDeveloper.animalapp


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun LoginUI(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var userNameValue by remember {mutableStateOf(TextFieldValue())}
    var passwordValue by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier.padding(top = 150.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        val image = painterResource(R.drawable.dog).apply {
            val rainbowColorsBrush = remember {
                Brush.sweepGradient(
                    listOf(
                        Color(0xFF815DC0),
                        Color(0xFFBA68C8),
                        Color(0xFFE57373),
                        Color(0xFFFFB74D),
                        Color(0xFFFFF176),
                        Color(0xFFAED581),
                        Color(0xFF4DD0E1),
                        Color(0xFF9575CD)
                    )
                )
            }


            Image(
                painter = painterResource(id = R.drawable.dog),
                contentDescription = "My image",
                alignment = Alignment.TopCenter,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(10.dp)
                    .border(
                        BorderStroke(width = (2.dp), rainbowColorsBrush),
                        RoundedCornerShape(16.dp)
                    )
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
        Text(
            text = "Welcome to the \nUser Login",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()


        )
        OutlinedTextField(
            value = userNameValue,
            onValueChange = { userNameValue = it },
            maxLines = 1,
            label = { Text("Enter the email: ") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        OutlinedTextField(
            value = passwordValue,
            onValueChange = { passwordValue = it },
            label = { Text("Enter the password") },

            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            //visualTransformation = PasswordVisualTransformation(),
            //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )

                Button(onClick = {navController.navigate("Dashboard")}) {
                    Text(
                        "Login",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 1.dp, bottom = 1.dp)
                    )
                }
        Text(
            AnnotatedString(            text = "Or login with"
            ),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
        modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = { navController.navigate("Forgot password") }) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google account login",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(CircleShape).height(30.dp).width(30.dp)
            )
        }

        ClickableText(
            text = AnnotatedString("Forgot password?"),
            onClick = { },
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline
            )
        )
    }
    Column(modifier = Modifier.padding(top = 498.dp,start = 80.dp), horizontalAlignment = Alignment.Start) {
        Row(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(start = 150.dp)) {
            ClickableText(
                text = AnnotatedString("Register"),
                onClick = { },
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Blue,
                    textAlign = TextAlign.End,
                    fontFamily = FontFamily.Default,
                    textDecoration = TextDecoration.Underline
                )
            )
        }
    }
}