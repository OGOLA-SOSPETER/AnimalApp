package com.SosDeveloper.animalapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
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
    Column(
        modifier = Modifier.padding(20.dp).verticalScroll(state = ScrollState(0), enabled = true)
    ) {
        val image = listOf<R.drawable>()
        val imageModifier = Modifier
            .size(100.dp)



        Box {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Row {
                    Box {
                        Image(
                            painter = painterResource(R.drawable.tech),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))

                        )
                        Text(
                            text = "Leopard",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
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
                            modifier = Modifier.padding(top = 90.dp, start = 38.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(19.dp))
                        )
                        Text(
                            text = "Developer",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 20.dp)
                        )
                    }
                    Box() {
                        IconButton({ "" }) {
                            Icon(
                                Icons.Filled.Favorite,
                                "MyIcon",
                                tint = Color.Blue

                            )
                        }
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )

                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.tech),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dogggy),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.tech),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.goat),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.tech),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.chicken),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.goat),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dogggy),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.chicken),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.chicken),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.goat),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.chicken),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.chicken),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.goat),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.tech),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
                Row {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.tech),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                    Box {
                        Image(
                            painter = painterResource(R.drawable.dog),
                            contentDescription = stringResource(R.string.image_photo),
                            contentScale = ContentScale.Crop,
                            modifier = imageModifier
                                .padding(8.dp)
                                .clip(shape = RoundedCornerShape(16.dp))
                        )
                        Text(
                            text = "Animal",
                            color = Color.Blue,
                            modifier = Modifier.padding(top = 90.dp, start = 23.dp)
                        )
                    }
                }
            }
            Column(modifier = Modifier, verticalArrangement = Arrangement.Bottom) {

                BottomAppBar {
                    IconButton(onClick = { navController.navigate("Menu") }) {
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
}
@Preview()
@Composable
fun MyImagePreview(){
    AnimalAppTheme {
MyImages(navController = rememberNavController())
    }
}
