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

class SixthActivity : ComponentActivity() {
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
                        ImageFor6()
                        TextFor6()
                        Row {
                            TrxtView6()
                        }
                        Row {
                            ButtonFor6()
                        }
                        Row{
                            ButtonFor6_1()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TrxtView6() {
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
                "Заголовок задачи",
                fontSize = 20.sp,
                color = Gray1,
                modifier = Modifier.padding(5.dp)
            )
        }
        Row(modifier = Modifier.padding(top = 10.dp, end = 20.dp)) {
            Box(
                modifier = Modifier
                    .size(148.dp, 32.dp)
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
                Row() {
                    androidx.compose.foundation.Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.greyclock)),
                        contentDescription = "clock",
                        modifier = Modifier
                            .size(17.dp)
                            .offset(x = (7).dp, y = (8).dp)
                    )
                    Text(
                        "16:30",
                        fontSize = 20.sp,
                        color = Gray1,
                        modifier = Modifier
                            .padding(5.dp)
                            .offset(10.dp)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(148.dp, 32.dp)
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
                Row() {
                    androidx.compose.foundation.Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.graycalend)),
                        contentDescription = "clock",
                        modifier = Modifier
                            .size(17.dp)
                            .offset(x = (7).dp, y = (8).dp)
                    )
                    Text(
                        "14.01.2021",
                        fontSize = 20.sp,
                        color = Gray1,
                        modifier = Modifier
                            .padding(5.dp)
                            .offset(10.dp)
                    )
                }
            }
        }
        Row(modifier = Modifier.offset(y = 10.dp)) {
            Box(
                modifier = Modifier
                    .size(312.dp, 96.dp)
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
                    "Описание задачи",
                    fontSize = 20.sp,
                    color = Gray1,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}


@Composable
fun ButtonFor6() {
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
            "Записать задачу",
            fontSize = 20.sp,
            color = White1
        )
    }
}

@Composable
fun ButtonFor6_1() {
    val White1: Color = White
    androidx.compose.material.Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            backgroundColor = Red1, contentColor = Red2
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (130).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "Удалить задачу",
            fontSize = 20.sp,
            color = White1
        )
    }
}


@Composable
fun ImageFor6() {
    androidx.compose.foundation.Image(
        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.backbutton)),
        contentDescription = "аватар",
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
fun TextFor6() {
    val White1: Color = White
    Text(
        "Изменить задачу",
        fontSize = 30.sp,
        modifier = Modifier.offset(x = 10.dp, y = (-50).dp),
        color = White1,
        fontWeight = FontWeight.Bold
    )
}
