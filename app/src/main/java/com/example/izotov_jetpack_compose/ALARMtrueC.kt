package com.example.izotov_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.izotov_jetpack_compose.ui.theme.*

class ALARMtrueC : ComponentActivity() {
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
                        ImageFor6lC()
                        TextFor6lC()
                        Row {
                            TrxtView6lc()
                        }
                        Row {
                            CheksC()
                        }
                        Row {
                            ButtonFor6lC()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TrxtView6lc() {
    Column(modifier = Modifier.padding(top = 10.dp, end = 20.dp)) {
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
                Row {
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
                Row {
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
    }
}

@Composable
fun CheksC() {
    Column(modifier = Modifier.offset(20.dp)) {
        Text(
            "?????????????????? ????????????",
            fontSize = 20.sp,
            color = Gray1,
            modifier = Modifier
                .padding(5.dp)
                .offset(10.dp)
        )
        Row(modifier = Modifier.offset(y = 10.dp)) {
            val isChecked = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = { isChecked.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "??????????????????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 10.dp)) {
            val isChecked2 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked2.value,
                onCheckedChange = { isChecked2.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "??????????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 20.dp)) {
            val isChecked3 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked3.value,
                onCheckedChange = { isChecked3.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "??????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 30.dp)) {
            val isChecked4 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked4.value,
                onCheckedChange = { isChecked4.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "??????????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp)
            )
        }
        Row(modifier = Modifier.offset(y = 40.dp)) {
            val isChecked5 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked5.value,
                onCheckedChange = { isChecked5.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(
                text = "??????????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 50.dp)) {
            val isChecked6 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked6.value,
                onCheckedChange = { isChecked6.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(text = "??????????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 60.dp)) {
            val isChecked7 = remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked7.value,
                onCheckedChange = { isChecked7.value = it },
                enabled = true,
                modifier = Modifier
                    .border(3.dp, Orange, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp)
            )
            Text(text = "??????????????????????",
                color = White,
                modifier = Modifier
                    .offset(x = 10.dp))
        }
    }
}


@Composable
fun ButtonFor6lC() {
    Button(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGreen, contentColor = DarkGreen
        ), modifier = Modifier
            .size(350.dp, 60.dp)
            .offset(x = 23.dp, y = (270).dp)
            .background(color = Green1), shape = RoundedCornerShape(15.dp)
    ) {
        Text(
            "?????????????????? ??????????????????",
            fontSize = 20.sp,
            color = White
        )
    }
}

@Composable
fun ImageFor6lC() {
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
fun TextFor6lC() {
    Text(
        "???????????????? ??????????????????",
        fontSize = 30.sp,
        modifier = Modifier.offset(x = 10.dp, y = (-50).dp),
        color = White,
        fontWeight = FontWeight.Bold
    )
}