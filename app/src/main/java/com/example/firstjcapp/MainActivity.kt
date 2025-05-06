package com.example.firstjcapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstjcapp.ui.theme.FirstJCAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstJCAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // layouts
    /*    Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(Color.Gray)
                .padding(16.dp)
                .fillMaxHeight()
                .fillMaxWidth()
        ) {

            Text(
                text = "Hello $name!",
                color = Color.Blue,
                fontSize = 30.sp,

                )
            Text(
                text = "Some other text!",
                color = Color.Blue,
                fontSize = 30.sp,
            )
        }*/
    /*    Row {
            Text(
                text = "Hello $name!",
                color = Color.Blue,
                fontSize = 30.sp,

                )
            Text(
                text = "Some other text!",
                color = Color.Blue,
                fontSize = 30.sp,
            )
        }*/
    /* Box(
         modifier = Modifier.size(300.dp)
     ) {
         Text(
             text = "Hello $name!",
             color = Color.Blue,
             fontSize = 30.sp,
             )
         Text(
             text = "Some other text!",
             color = Color.Blue,
             fontSize = 30.sp,
             modifier = Modifier.align(Alignment.BottomEnd)
         )
     }*/

    // image and icon
    /*Image(painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier.background(Color.Gray))*/
    /*Icon(
        imageVector = Icons.Default.Add,
        contentDescription = null
    )*/
    /*  Column {
          for (i in 1..10){
              Icon(
                  imageVector = Icons.Default.Add,
                  contentDescription = null
              )
          }
      }*/

    // lists
   /* LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(10) { i ->
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
    }*/
    LazyRow(modifier = Modifier.fillMaxSize()) {
        items(10) { i ->
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstJCAppTheme {
        Greeting("Nouman")
    }
}