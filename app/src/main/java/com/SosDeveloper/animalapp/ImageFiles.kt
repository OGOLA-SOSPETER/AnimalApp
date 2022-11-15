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
    color = Color.Blue,
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
                        color = Color.Blue,
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
                        color = Color.Blue,
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
                    painter = painterResource(id = R.drawable.c1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(id = R.drawable.c2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(R.drawable.c3),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.c4),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.c5),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.c6),
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
                    painter = painterResource(R.drawable.c7),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.c8),
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
    //Box{
        //Icon(
            //modifier = Modifier.size(34.dp),
            //imageVector = ImageVector.vectorResource(id = R.drawable.leopards),
            //contentDescription = "Some icon",
            //tint = Color.White
        //)
    //}
}

@Preview()
@Composable
fun MyImagePreview(){
    AnimalAppTheme {
MyImages(navController = rememberNavController())
    }
}
