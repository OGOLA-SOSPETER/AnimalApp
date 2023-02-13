package  com.SosDeveloper.animalapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.DefaultTintColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Dashboard(navController: NavHostController)
{
var scaffoldState = rememberScaffoldState(drawerState = rememberDrawerState(DrawerValue.Open))

  Scaffold(
      scaffoldState = scaffoldState,
      topBar = {
          TopAppBar(backgroundColor = DefaultTintColor,elevation = 4.dp) {
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(Icons.Filled.MoreVert, contentDescription ="Overflow Menu." )
              }
              Text(text = "\t\tFashion House.")

          }
      },
      content = {
DashPage(navController = rememberNavController())
      },
      floatingActionButton = {

      },
      bottomBar = {
          BottomAppBar(backgroundColor = DefaultTintColor,elevation = 6.dp) {

              IconButton(onClick = { /*TODO*/ }) {
                  Icon(Icons.Filled.ShoppingCart, contentDescription ="Bookings." )
              }
              Spacer(modifier = Modifier.width(35.dp))
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(Icons.Filled.Search, contentDescription ="Searches" )
              }
              Spacer(modifier = Modifier.width(30.dp))

              IconButton(onClick = { /*TODO*/ }) {
                  Icon(Icons.Filled.Home, contentDescription ="Home Menu." )
              }
              Spacer(modifier = Modifier.width(40.dp))
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(Icons.Filled.List, contentDescription ="List Menu." )
              }

          }
      }
  )
}

@Composable
fun DashPage(navController: NavHostController)
{
    Column {
        LazyRow(content = {
            item {
                OutlinedButton(modifier = Modifier.width(50.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Ladies")
                }
            }
            item {
                OutlinedButton(modifier = Modifier.width(50.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Men")
                }
            }
            item {
                OutlinedButton(modifier = Modifier.width(50.dp),onClick = { /*TODO*/ }) {
                    Text(text = "Children")
                }
            }
        })
    }
}
@Preview
@Composable
fun PreviewDashboard(){
    Dashboard(navController = rememberNavController())
}
