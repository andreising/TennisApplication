package com.andrei_singeleytsev.tennisapplication.ui.screen.main_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andrei_singeleytsev.tennisapplication.R
import com.andrei_singeleytsev.tennisapplication.ui.theme.MainColor
import com.andrei_singeleytsev.tennisapplication.ui.theme.PrimaryColor

@Preview
@Composable
fun MainScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(MainColor)) {
        Image(painter = painterResource(id = R.drawable.background), modifier = Modifier.fillMaxSize(),  contentDescription = null)
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.main_title),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 60.dp),
                contentScale = ContentScale.FillWidth,
                contentDescription = null
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                contentScale = ContentScale.FillWidth,
                contentDescription = null
            )
            TextButton( onClick = {

            }, colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryColor
            ),   border = BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(18.dp), ) {
                Text(
                    text = "PLAY", modifier = Modifier.padding(top = 56.dp, bottom = 56.dp, start = 20.dp, end = 20.dp),
                    fontSize = 40.sp
                )
            }
        }
    }
}