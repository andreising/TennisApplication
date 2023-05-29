package com.andrei_singeleytsev.tennisapplication.ui.screen.game_screen

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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andrei_singeleytsev.tennisapplication.R
import com.andrei_singeleytsev.tennisapplication.ui.theme.MainColor
import com.andrei_singeleytsev.tennisapplication.ui.theme.PrimaryColor
import com.andrei_singeleytsev.tennisapplication.ui.theme.SecondPrimary

@Preview
@Composable
fun GameScreen() {
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
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
            Image(
                painter = painterResource(id = R.drawable.ball),
                modifier = Modifier.size(182.dp),
                contentDescription = null
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 44.dp, start = 28.dp, end = 28.dp)
                .background(PrimaryColor),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, bottom = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(shape = RoundedCornerShape(7.dp)) {
                    Column(
                        modifier = Modifier
                            .background(SecondPrimary)
                            .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "SCORE", style = TextStyle(
                                color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp
                            )
                        )

                        Text(
                            text = "12", style = TextStyle(
                                color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp
                            )
                        )
                    }
                }
                Card(
                    shape = RoundedCornerShape(7.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(SecondPrimary)
                    ) {
                        Text(
                            modifier = Modifier.padding(4.dp),
                            text = "X: " + "1",
                            style = TextStyle(
                                color = Color.White, fontWeight = FontWeight.Bold, fontSize = 32.sp
                            )
                        )
                    }

                }

            }
        }
    }
}