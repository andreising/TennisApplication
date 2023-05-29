package com.andrei_singeleytsev.tennisapplication.ui.screen.result_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andrei_singeleytsev.tennisapplication.R
import com.andrei_singeleytsev.tennisapplication.ui.theme.BorderColor
import com.andrei_singeleytsev.tennisapplication.ui.theme.MainColor
import com.andrei_singeleytsev.tennisapplication.ui.theme.PrimaryColor

@Preview
@Composable
fun ResultScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MainColor)
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            modifier = Modifier.fillMaxSize(),
            contentDescription = null
        )
        Card(
            modifier = Modifier
                .padding(top = 44.dp, start = 30.dp, end = 30.dp, bottom = 200.dp),
            colors = CardDefaults.cardColors(
                containerColor = PrimaryColor
            ),
            shape = RoundedCornerShape(18.dp)
        ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "SCORE", style = TextStyle(
                            color = Color.White, fontWeight = FontWeight.Bold, fontSize = 30.sp))

                        Text(text = "12", style = TextStyle(
                            color = Color.White, fontWeight = FontWeight.Bold, fontSize = 30.sp))
                        Text(text = "TIME : " + "22.5",  style = TextStyle(
                            color = Color.White, fontWeight = FontWeight.Bold, fontSize = 30.sp, shadow = Shadow(
                                color = Color.Black,
                                offset = Offset(0f, 4f),
                                blurRadius = 4f
                            )
                        ))
                    }
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally ) {
                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.cup),
                                modifier = Modifier.size(88.dp),
                                contentDescription = null
                            )
                            Image(
                                painter = painterResource(id = R.drawable.cup),
                                modifier = Modifier.size(112.dp),
                                contentDescription = null
                            )
                            Image(
                                painter = painterResource(id = R.drawable.cup),
                                modifier = Modifier.size(88.dp),
                                contentDescription = null
                            )
                        }
                        TextButton(
                            modifier = Modifier.padding(top = 44.dp),
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = PrimaryColor
                            ),
                            border = BorderStroke(2.dp, BorderColor), shape = RoundedCornerShape(18.dp),
                        ) {
                            Text(
                                text = "PLAY",
                                modifier = Modifier.padding(
                                    top = 32.dp,
                                    bottom = 36.dp,
                                    start = 12.dp,
                                    end = 12.dp
                                ),
                                fontSize = 24.sp
                            )
                        }
                    }

                }


        }

    }
}