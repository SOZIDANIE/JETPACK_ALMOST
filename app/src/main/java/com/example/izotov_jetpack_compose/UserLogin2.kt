package com.example.izotov_jetpack_compose

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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.izotov_jetpack_compose.ui.theme.*

class UserLogin2 : ComponentActivity() {
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
                        ImageFor511()
                        TextFor511()
                        Row {
                            TrxtView11()
                        }
                        Row {
                            ButtonFor511()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TrxtView11() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp)) {
        Box(
            modifier = Modifier
                .size(312.dp, 32.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 5.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp,
                        bottomStart = 5.dp,
                    )
                )
                .background(White)
        ) {
            Text(
                "Имя пользователя",
                fontSize = 20.sp,
                color = Gray1,
                modifier = Modifier.padding(5.dp)
            )
        }
        Box(
            modifier = Modifier
                .size(312.dp, 32.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 5.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp,
                        bottomStart = 5.dp,
                    )
                )
                .background(White)
        ) {
            Text(
                "Адрес электронной почты",
                fontSize = 20.sp,
                color = Gray1,
                modifier = Modifier.padding(5.dp)
            )
        }
        Box(
            modifier = Modifier
                .size(312.dp, 32.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 5.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp,
                        bottomStart = 5.dp,
                    )
                )
                .background(White)
        ) {
            Text(
                "Пароль",
                fontSize = 20.sp,
                color = Gray1,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Composable
fun ButtonFor511() {
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (270).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Регистрация",
            fontSize = 20.sp,
            color = White1
        )
    }
}


@Composable
fun ImageFor511() {
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "назад",
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
fun TextFor511() {
    val White1: Color = White
    Text(
        "Регистрация",
        fontSize = 30.sp,
        modifier = Modifier.offset(x = 10.dp, y = (-50).dp),
        color = White1,
        fontWeight = FontWeight.Bold
    )
}