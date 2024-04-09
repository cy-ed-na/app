package com.example.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morning.ui.theme.MorningTheme

class PaycartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pay()
        }
    }
}

@Composable
fun Pay(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        val mContext = LocalContext.current

        //Centering an Image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.shopping1) ,
                contentDescription = "Watch",
                modifier = Modifier
                    .size(180.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

        }

        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "Choose Your Product",
            fontSize = 25.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center)
        androidx.compose.material3.Text(
            text = "A comfortable sofa is an obvious must have, but so is a perfect lounge chair. Not only is extra seating ideal for having company, but it also levels up your home's decor to make it feel more cozy and inviting.")
        Spacer(modifier = Modifier.height(10.dp))


        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,ChairsActivity::class.java))

            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        ) {
            Text(text = "Get Started")
        }
        Spacer(modifier = Modifier.height(10.dp))



    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PayPreview(){
    Pay()
}