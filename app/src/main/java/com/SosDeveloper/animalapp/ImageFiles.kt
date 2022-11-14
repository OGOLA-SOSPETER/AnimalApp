package com.SosDeveloper.animalapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.animalapp.ui.theme.AnimalAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun MyImages(navController: NavHostController) {
    val image = listOf<R.drawable>()
    val imageModifier = Modifier
        .size(100.dp)



    Box {
        Column (modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()){
            Row {
Box {
    Image(
        painter = painterResource(R.drawable.leopard),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = imageModifier
            .padding(8.dp)
            .clip(shape = RoundedCornerShape(16.dp))

    )
    Text(
        text = "Leopard",
    color = Color.White,
        modifier = Modifier.padding(top=90.dp,start = 23.dp)
    )
}
                Box {
                    Image(
                        painter = painterResource(R.drawable.dog),
                        contentDescription = "image of dog",
                        contentScale = ContentScale.Crop,
                        modifier = imageModifier
                            .padding(8.dp)
                            .clip(shape = RoundedCornerShape(16.dp))

                    )
                    Text(
                        text = "Dog",
                        color = Color.White,
                        modifier = Modifier.padding(top=90.dp,start = 38.dp)
                    )
                }
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.alx),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = imageModifier
                            .padding(8.dp)
                            .clip(shape = RoundedCornerShape(19.dp))
                    )
                    Text(
                        text = "Developer",
                        color = Color.White,
                        modifier = Modifier.padding(top=90.dp,start = 20.dp)
                    )
                }
                Box() {
                    IconButton({ "" }) {
                        Icon(Icons.Filled.Favorite, "MyIcon")
                    }
                }
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.african_lion_portrait_warm_light),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(id = R.drawable.young_leopard_portrait),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(R.drawable.leopard),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.leopards),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.alx),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.leopard),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
            }

            Row {
                Image(
                    painter = painterResource(R.drawable.dog),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.leopards),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.ostritch),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
            }

        }
        Column(modifier = Modifier.align(alignment = Alignment.BottomCenter)) {
        Button(onClick = { navController.navigate("Dashboard") }) {


                Text(
                    "BacktoMain",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )

            }

        }
    }
    Box{
        Icon(
            modifier = Modifier.size(34.dp),
            imageVector = ImageVector.vectorResource(id = R.drawable.leopards),
            contentDescription = "Some icon",
            tint = Color.White
        )
    }
}
@Preview()
@Composable
fun Preview(){
    AnimalAppTheme {
MyImages(navController = rememberNavController())
    }
}