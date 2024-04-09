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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morning.ui.theme.MorningTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()

        }
    }
}

@Composable
fun Woof(){
    Column (
        modifier = Modifier.fillMaxSize()
    ){

        Row {

            androidx.compose.material3.Text(
                text = "Woof",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 50.dp)
            )
        }



        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Koda",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "2 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Lola",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "16 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Frankie",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "2 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Nox",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "8 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Faye",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "8 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Bella",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "14 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Moana",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "2 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Tzeitel",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "7 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Owen",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "3 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Lexy",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "6 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1




        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier
            .verticalScroll(rememberScrollState())) {

            //card 1
            Card (
                modifier = Modifier
                    .height(50.dp)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxWidth()
            ){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(35.dp)
                            .padding(start = 5.dp),
                        contentAlignment = Alignment.CenterStart,

                    ) {
                        Image(painter = painterResource(id = R.drawable.dog) ,
                        contentDescription = "W",
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 12.dp, top = 7.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)

                        Column {
                            androidx.compose.material3.Text(
                                text = "Speck",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 10.dp))

                            androidx.compose.material3.Text(
                                text = "2 years old",
                                fontSize = 10.sp,
                                modifier = Modifier
                                    .padding(start = 50.dp, top = 1.dp)
                            )

                        }



                    }




            }
            //end of card 1
            Spacer(modifier = Modifier.width(20.dp))



        }
        //end of row 1





    }

}
@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()
}
