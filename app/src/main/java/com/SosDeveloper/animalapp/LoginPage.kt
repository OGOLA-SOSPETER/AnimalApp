package com.SosDeveloper.animalapp



import android.app.Activity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth

val userLog  = "352810232419-l68bqr50a5cbqusaarprv6m1prtl8fqs.apps.googleusercontent.com"
private lateinit var auth: FirebaseAuth

@Composable
fun LoginUI(navController: NavHostController) {
    val colors= Color(0xFF1976D2)
    var userNameValue by remember {mutableStateOf(TextFieldValue())}
    var passwordValue by remember { mutableStateOf(TextFieldValue()) }
    auth = FirebaseAuth.getInstance()
    val startForResult =
        rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                if (result.data != null) {
                    val task: Task<GoogleSignInAccount> =
                        GoogleSignIn.getSignedInAccountFromIntent(intent)
                     if (task.result != null){
                         navController.navigate("Dashboard")
                     }

                }
            }
        }
Column(modifier = Modifier
    .background(color = Color.LightGray, shape = RoundedCornerShape(5.dp))
    .fillMaxSize()

    ) {
    Column(
        modifier = Modifier.padding(top = 70.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        val image = painterResource(R.drawable.tech).apply {
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
                painter = painterResource(id = R.drawable.image),
                contentDescription = "logo",
                alignment = Alignment.TopCenter,
                //contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(10.dp)
                    .size(150.dp)
                // .border(
                //   BorderStroke(width = (2.dp), rainbowColorsBrush),
                //   CircleShape
                //)
                //.clip(CircleShape)
            )
        }
        Text(
            text = "Welcome to the \nUser Login",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            color = Color.Black,
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
        var passwordVisible by rememberSaveable { mutableStateOf(false) }

        OutlinedTextField(
            value = passwordValue,
            onValueChange = { passwordValue = it },
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters),
            trailingIcon = {
val description = if (passwordVisible) "show password" else "Hide password"
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                if (passwordVisible )
                Image(painter = painterResource(id = R.drawable.visibility),
                    contentDescription = description )
                else
                    Image(painter = painterResource(id = R.drawable.visibility_off),
                        contentDescription = description )
            }

                           },
            maxLines = 1,
            label = { Text("Enter the password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else  PasswordVisualTransformation(),
            //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )

        Button( onClick = { navController.navigate("Dashboard") },
            elevation = ButtonDefaults.elevation(5.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF1976D2))
        ) {

                Text(
                    "Login",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                    color = Color.White
                )
                           }
        Text(
            AnnotatedString(
                text = "Or login with"
            ),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedButton(modifier = Modifier.width(300.dp),onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.googlelogo),
                contentDescription = "google login",
                modifier = Modifier.size(30.dp),

            )
            Spacer(modifier = Modifier.width(30.dp))
            Text("Google Account Login", color = colors)
        }

        OutlinedButton(modifier = Modifier.width(300.dp),onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.logo_facebook),
                contentDescription = "facebook login",
                modifier = Modifier.size(30.dp),

            )
            Spacer(modifier = Modifier.width(20.dp))

            Text("FaceBook Account Login", color = colors)
        }

        OutlinedButton(modifier = Modifier.width(300.dp), onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.call),
                contentDescription = "phone login",
                modifier = Modifier.size(30.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))

            Text("One Time Password Login", color = colors)
        }
        Text(
            text = "By clicking Login you agree to our Terms And Conditions\n" +
                    "and our Privacy Policy.",

            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 30.dp),
            fontFamily = FontFamily.Default


        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                Icons.Default.CheckCircle,
                tint = Color.Gray,
                contentDescription = "checkbox",
            )
        }



        ClickableText(
            text = AnnotatedString("Forgot password?"),
            onClick = { navController.navigate("Forgot password")},
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline
            )
        )
    }
    Column(
        modifier = Modifier.padding(top = 498.dp, start = 80.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(start = 180.dp)
        ) {
            ClickableText(
                text = AnnotatedString("Register"),
                onClick = { navController.navigate("Registration") },
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
}

@Preview
@Composable
fun ImagePreviewer(){
    LoginUI(navController = rememberNavController())
}


