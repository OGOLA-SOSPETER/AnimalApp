package com.SosDeveloper.animalapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.SosDeveloper.animalapp.ui.theme.AnimalAppTheme

@Composable
fun MyImages(navController: NavHostController) {
    val image = listOf<R.drawable>()
    val imageModifier = Modifier
        .size(100.dp)



    Box {
        Column {
            Row {

                Image(
                    painter = painterResource(R.drawable.leopard),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.padding(8.dp).clip(shape = RoundedCornerShape(16.dp))

                )
                Image(
                    painter = painterResource(R.drawable.dog),
                    contentDescription = "image of dog",
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.padding(8.dp).clip(shape = RoundedCornerShape(16.dp))

                )
                Image(
                    painter = painterResource(id = R.drawable.alx),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.padding(8.dp).clip(shape = RoundedCornerShape(16.dp))
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.leopards),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.padding(8.dp).clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(id = R.drawable.ostritch),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.padding(8.dp).clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(R.drawable.leopard),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.padding(8.dp).clip(shape = RoundedCornerShape(16.dp))
                )
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.leopards),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.alx),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.leopard),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
            }

            Row {
                Image(
                    painter = painterResource(R.drawable.dog),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.leopards),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.ostritch),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
            }

        }
        Button(onClick = { navController.navigate("Dashboard") }) {
            Text(
                "BacktoMain",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 10.dp, bottom = 1.dp)
            )
        }
    }
}
@Preview()
@Composable
fun Preview(){
    AnimalAppTheme {
MyImages(navController = rememberNavController())
    }
}