package com.example.morning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Form(

            )

        }
    }
}

@Composable
fun Form(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.bg),
                contentScale = ContentScale.FillBounds
            )
    ) {
        var firstname by remember { mutableStateOf(" ") }
        var lastname by remember { mutableStateOf(" ") }
        var email by remember { mutableStateOf(" ") }
        var password by remember { mutableStateOf(" ") }
        var contact by remember { mutableStateOf(" ") }
        var location by remember { mutableStateOf(" ") }



        //Centering an Image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.form) ,
                contentDescription = "reg",
                modifier = Modifier
                    .size(180.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

        }
        androidx.compose.material3.Text(
            text = "Create an Account",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier.height(5.dp))
        TextField(
            value =firstname ,
            onValueChange ={firstname = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter Firstname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(5.dp))

TextField(
            value =lastname ,
            onValueChange ={lastname = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter Lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(5.dp))

TextField(
            value =email ,
            onValueChange ={email = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter Email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(5.dp))

TextField(
            value =password ,
            onValueChange ={password = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter Password",
                color = Color.Black)},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Password),
    visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(5.dp))

TextField(
            value =contact ,
            onValueChange ={contact = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter Contact")},
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "cont")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value = location,
            onValueChange = {location = it},
            placeholder = { androidx.compose.material3.Text(text = "Enter Location",
                color = Color.Black
                )},
            leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "cont")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType =  KeyboardType.Text))

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                /*TODO*/
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        ) {
            Text(text = "Sign up")
        }
        androidx.compose.material3.Text(
            text = "Already have an account? Login",
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center)



        //End Of Column
    }




     //End of Form
    }



@Preview(showBackground = true)
@Composable
fun FormPrieview(){
    Form()
}