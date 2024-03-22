package com.example.morning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalContentColor
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morning.ui.theme.MorningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text(){
  Column(modifier = Modifier.fillMaxSize()) {

      val mContext = LocalContext.current

      androidx.compose.material3.Text(
          text = "Welcome to Android",
          fontSize = 25.sp,
          color = Color.Blue,
          fontWeight = FontWeight.Bold,
          fontStyle = FontStyle.Italic)
      androidx.compose.material3.Text(
          text = "It entails all android applications that are shown on an Android device.")
      Spacer(modifier = Modifier.height(10.dp))
       androidx.compose.material3.Text(
          text = "Types of Cars",
          color = Color.White,
          fontSize = 25.sp,
           fontWeight = FontWeight.Bold,
          textDecoration = TextDecoration.Underline,
           textAlign = TextAlign.Center,
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Blue)
              .height(30.dp)

      )
      androidx.compose.material3.Text(
          text = "1.Ferrari" )
      androidx.compose.material3.Text(
          text = "2.Lamborghini" )
      androidx.compose.material3.Text(
          text = "3.Audi" )

      Column(
          modifier = Modifier.fillMaxWidth(),
          horizontalAlignment = Alignment.CenterHorizontally
      ) {
          Button(onClick = {/*TODO*/},
              colors = ButtonDefaults.buttonColors(Color.Blue)
          )
          { Text("See More") }
      }

      Spacer(modifier = Modifier.height(10.dp))
      androidx.compose.material3.Text(
          text = "Course Offered",
          color = Color.White,
          fontSize = 25.sp,
          fontStyle = FontStyle.Italic,
          fontWeight = FontWeight.Bold,
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Blue)
              .height(30.dp),
          textAlign = TextAlign.Center,
          textDecoration = TextDecoration.Underline
      )
      androidx.compose.material3.Text(
          text = "1.MIT" )
      androidx.compose.material3.Text(
          text = "2.Cyber Security" )
      androidx.compose.material3.Text(
          text = "3.Data Science" )
      Spacer(modifier = Modifier.height(10.dp))
      Divider()
      Spacer(modifier = Modifier.height(10.dp))

      //Centering an Image
     Box(modifier = Modifier.fillMaxWidth(),
         contentAlignment = Alignment.Center) {
         Image(painter = painterResource(id = R.drawable.watch2) ,
             contentDescription = "Watch",
             modifier = Modifier
                 .size(180.dp)
                 .clip(shape = CircleShape),
             contentScale = ContentScale.Crop)

     }

      Spacer(modifier = Modifier.height(10.dp))
      
      Button(
          onClick = {
                    mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
          },
          shape = RoundedCornerShape(5.dp),
          colors = ButtonDefaults.buttonColors(Color.Blue),
          modifier = Modifier
              .fillMaxWidth()
              .padding(start = 30.dp, end = 30.dp)

      ) {
          androidx.compose.material3.Text(text = "Continue")
      }
      




  }


}

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()

}