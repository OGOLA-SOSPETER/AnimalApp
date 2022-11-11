package com.SosDeveloper.animalapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.animalapp.ui.theme.AnimalAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimalAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //LoginUI(context = applicationContext)
                    val navController = rememberNavController()
                    AnimalNavigation(navController = navController)
                }

            }
        }
    }
}







@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AnimalAppTheme {
        //LoginUI(context = LocalContext.current
    }
}