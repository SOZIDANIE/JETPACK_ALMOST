package com.example.izotov_jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.izotov_jetpack_compose.ui.theme.*

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Izotov_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green1
                ) {
                    Column (modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)) {
                        ImageForp()
                        TextForp()
                        Row {
                            ImageForPerson()
                        }
                        Row {
                            ButtonForp()
                        }
                        Row{
                            ButtonFor6_p()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ButtonForp() {
    val context = LocalContext.current
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = { val inte = Intent(context, UserLogin2::class.java)
            ContextCompat.startActivity(context, inte, null ) }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (270).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "??????????????????????",
            fontSize = 20.sp,
            color = White1,
            fontWeight = FontWeight.Normal
        )
    }
}



@Composable
fun ButtonFor6_p() {
    val context = LocalContext.current
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = {  val inte = Intent(context, UserLogin::class.java)
            ContextCompat.startActivity(context, inte, null )}, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (130).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)

    ) {
        Text(
            "??????????",
            fontSize = 20.sp,
            color = White1,
            fontWeight = FontWeight.Normal
        )
    }
}


@Composable
fun ImageForp() {
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "????????????",
        modifier = Modifier
            .size(60.dp)
            .offset(x = (325).dp, y = (5).dp)
            .clickable(
                onClick = {


                }
            )
    )
}

@Composable
fun ImageForPerson() {
    Column() {

        androidx.compose.foundation.Image(
            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.avatar1)),
            contentDescription = "????????????",
            modifier = Modifier
                .size(193.dp, 193.dp)
                .offset(x = (100).dp, y = (0).dp)
                .clickable(
                    onClick = {
                    }
                )
        )
        Text(
            "???????? ???? ????????????????",
            fontSize = 20.sp,
            color = White,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.offset(x = 125.dp, y = (60).dp)
        )
    }
}


@Composable
fun TextForp() {
    val White1: Color = White
    Text(
        "?????????????? ????????????????????????",
        fontSize = 30.sp,
        modifier = Modifier.offset(x = 10.dp, y = (-50).dp),
        color = White1,
        fontWeight = FontWeight.Bold
    )
}
