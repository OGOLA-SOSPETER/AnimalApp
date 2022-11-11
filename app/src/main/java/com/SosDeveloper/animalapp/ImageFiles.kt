package com.SosDeveloper.animalapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    painter = painterResource(R.drawable.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))

                )
                Image(
                    painter = painterResource(R.drawable.dog),
                    contentDescription = "image of dog",
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))

                )
                Image(
                    painter = painterResource(id = R.drawable.alx),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.african_lion_portrait_warm_light),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(id = R.drawable.elephants_drinking_water),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )

                Image(
                    painter = painterResource(R.drawable.group_elephants_big_green_tree_wilderness),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
            }
            Row {
                Image(
                    painter = painterResource(R.drawable.lion_sitting_middle_trees_near_cactuses),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.male_female_lions_laying_sand_resting),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.young_leopard_portrait),
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
                    painter = painterResource(R.drawable.young_leopard_portrait),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
                Image(
                    painter = painterResource(R.drawable.young_leopard_portrait),
                    contentDescription = stringResource(R.string.image_photo),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier.clip(shape = RoundedCornerShape(16.dp))
                )
            }

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