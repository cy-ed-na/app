package com.example.morning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morning.ui.theme.MorningTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination() {
    Column(
        modifier = Modifier
            .fillMaxSize()


    ) {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {

                })
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Favorite, contentDescription = "Share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings, contentDescription = "Settings",
                        tint = Color.White
                    )


                }
            }
        )
        //End of TopAppBar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.destination),
                contentDescription = "go to",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            androidx.compose.material3.Text(
                text = "Let's plan your next vacation",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )


        }
        //end of box

        //Search bar
        var search by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = { androidx.compose.material3.Text(text = "What's your next Destination?") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "des")

                //end of column
            })
        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "Recently Viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 20.dp))

        Spacer(modifier = Modifier.height(10.dp))

       Row(modifier = Modifier
           .horizontalScroll(rememberScrollState())) {

           //card 1
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ){
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(painter = painterResource(id = R.drawable.antartica),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   androidx.compose.material3.Text(
                       text = "New York",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }
           }
           //end of card 1
           Spacer(modifier = Modifier.width(20.dp))

           //card 2
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ){
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(painter = painterResource(id = R.drawable.antartica),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   androidx.compose.material3.Text(
                       text = "Antartica",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }
           }
           //end of card 2
           Spacer(modifier = Modifier.width(20.dp))

           //card 3
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ){
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(painter = painterResource(id = R.drawable.austrailia),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   androidx.compose.material3.Text(
                       text = "Austrailia",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }
           }
           //end of card 3

           Spacer(modifier = Modifier.width(20.dp))

           //card 4
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ) {
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.miami),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )

                   }
                   androidx.compose.material3.Text(
                       text = "Miami",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center
                   )

               }
           }
               //End of card 4

               //card 5
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ) {
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.miami),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )

                   }
                   androidx.compose.material3.Text(
                       text = "Canada",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center
                   )
               }
           }
               //End of card 5

               //card 6
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ) {
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.miami),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop
                       )

                   }
                   androidx.compose.material3.Text(
                       text = "South Africa",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center
                   )
               }
           }

           //end of card 6

               //card 7
           Card (
               modifier = Modifier
                   .height(250.dp)
                   .width(200.dp)
           ){
               Column {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       Image(painter = painterResource(id = R.drawable.miami),
                           contentDescription = "des",
                           modifier = Modifier
                               .fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   androidx.compose.material3.Text(
                       text = "Germany",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }
           }
           //end of card 7



       }
        //end of row 1






    }
}



@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()

}
