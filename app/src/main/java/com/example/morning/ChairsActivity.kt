package com.example.morning

import android.content.Intent
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.morning.ui.theme.MorningTheme

class ChairsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Chairs()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chairs() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title = { },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
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
                        imageVector = Icons.Default.ShoppingCart, contentDescription = "Share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu, contentDescription = "Settings",
                        tint = Color.White
                    )


                }
            }
        )
        //End of TopAppBar
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            Column {
                androidx.compose.material3.Text(
                    text = "Chairs",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold
                )

            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "Tables",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal

                )

            }
            Spacer(modifier = Modifier.width(8.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Sofa",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal

                )

            }
            Spacer(modifier = Modifier.width(8.dp))

            Column {
                androidx.compose.material3.Text(
                    text = "Beds",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal

                )

            }

        }
        //end of chair row
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            //column 1
            Column {
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                )
                {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.greychair),
                            contentDescription = "ny",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "fav",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )

                    }



                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(5.dp))


                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = " comfy seat",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "From Kshs.38900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                }

            }

            //end of column 1


            Spacer(modifier = Modifier.width(5.dp))

            //column 2
            Column {
                Card(
                    modifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.lovesackchair),
                            contentDescription = "ny",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "fav",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(15.dp)
                        )


                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "Kew Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(5.dp))



                    androidx.compose.material3.Text(
                        text = "luxurious",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    androidx.compose.material3.Text(
                        text = "From Kshs.38900",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                }

                //end of column 2
            }
        }
            //End of row 1
            Spacer(modifier = Modifier.height(15.dp))


            //row2
            Row {
                //column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                    )
                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.greychair),
                                contentDescription = "ny",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "fav",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }



                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Amos Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.ExtraBold,
                        )

                        Spacer(modifier = Modifier.height(5.dp))


                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = " comfy seat",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "From Kshs.38900",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                    }

                }

                //end of column 1


                Spacer(modifier = Modifier.width(5.dp))

                //column 2
                Column {
                    Card(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.lovesackchair),
                                contentDescription = "ny",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "fav",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(15.dp)
                            )


                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "Kew Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.ExtraBold,
                        )

                        Spacer(modifier = Modifier.height(10.dp))



                        androidx.compose.material3.Text(
                            text = "luxurious",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(5.dp))

                        androidx.compose.material3.Text(
                            text = "From Kshs.38900",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black
                        )
                    }

                    //end of column 2
                }
            }
                //End of row 2
                Spacer(modifier = Modifier.height(15.dp))
              //row 3
                Row {
                    //column 1
                    Column {
                        Card(
                            modifier = Modifier
                                .height(150.dp)
                                .width(150.dp)
                        )
                        {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.greychair),
                                    contentDescription = "ny",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "fav",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(15.dp)
                                )

                            }



                            Spacer(modifier = Modifier.height(5.dp))

                            androidx.compose.material3.Text(
                                text = "Amos Chair",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                fontWeight = FontWeight.ExtraBold,
                            )

                            Spacer(modifier = Modifier.height(5.dp))


                            Spacer(modifier = Modifier.height(5.dp))

                            androidx.compose.material3.Text(
                                text = " comfy seat",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                            )
                            Spacer(modifier = Modifier.height(5.dp))

                            androidx.compose.material3.Text(
                                text = "From Kshs.38900",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black
                            )
                        }

                    }

                    //end of column 1


                    Spacer(modifier = Modifier.width(5.dp))

                    //column 2
                    Column {
                        Card(
                            modifier = Modifier
                                .height(150.dp)
                                .width(150.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.lovesackchair),
                                    contentDescription = "ny",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.FillBounds
                                )
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = "fav",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .padding(15.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(5.dp))

                            androidx.compose.material3.Text(
                                text = "Kew Chair",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                fontWeight = FontWeight.ExtraBold,
                            )

                            Spacer(modifier = Modifier.height(10.dp))



                            androidx.compose.material3.Text(
                                text = "luxurious",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                            )
                            Spacer(modifier = Modifier.height(5.dp))

                            androidx.compose.material3.Text(
                                text = "From Kshs.38900",
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color.Black
                            )
                        }

                        //end of column 2
                    }

                //End of row 3
                }
            }

        }


//end of row 1








@Preview(showBackground = true)
@Composable
fun ChairsPreview(){
    Chairs()
}