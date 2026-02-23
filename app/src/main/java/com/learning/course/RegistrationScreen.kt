package com.learning.course

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.learning.course.ui.theme.Typography
import com.learning.course.ui.theme.emeraldGreen
import com.learning.course.ui.theme.orange
import com.learning.course.ui.theme.royalBlue

@Preview
@Composable
fun registrationScreen(maxWidth : Dp = 400.dp) {
    Column(Modifier.padding(top = 40.dp)
        .padding(10.dp)
        .fillMaxSize()) {

        Text("Регистрация",Modifier
            .fillMaxWidth()
            .height(25.dp),
            style = Typography.titleLarge
        )


        mainElement({},{})

        HorizontalDivider(modifier = Modifier, thickness = 1.dp,color = Color.White)

        Row(Modifier
            .padding(top = 10.dp)
            .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {},Modifier
                .size(height = 55.dp,
                    width = (maxWidth * 0.5F) * 0.9F),

                colors = ButtonDefaults.buttonColors(
                containerColor = orange
            )){

            }
            Button(onClick = {},Modifier
                .size(height = 55.dp,
                    width = (maxWidth * 0.5F) * 0.9F),

                colors = ButtonDefaults.buttonColors(
                containerColor = royalBlue)
            ){

            }
        }

    }
}

@Composable
fun mainElement(anotherFun : () -> Unit,clickable : () -> Unit,widthFun : Dp = 400.dp) {
    Column(Modifier
        .padding(top = 15.dp)
        .padding(vertical = 25.dp)
    ) {
        Text("Email")
        TextField(value = "example@example.com",
            onValueChange = {}, Modifier
                .padding(top = 7.dp)
                .fillMaxWidth()
        )

        Text("Пароль",Modifier.padding(top = 10.dp))
        TextField(value = "Введите пароль",
            onValueChange = {},
            Modifier
                .padding(top = 7.dp)
                .fillMaxWidth()
        )

        Text("Повторите пароль",Modifier.padding(top = 10.dp))
        TextField(value = "Введите пароль еще раз",
            onValueChange = {},
            Modifier
                .padding(top = 7.dp)
                .fillMaxWidth()
        )

        Button(onClick = anotherFun,
            Modifier
                .padding(top = 10.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .width(width = ((widthFun * 0.5F)* 1.2F)),

            colors = ButtonDefaults.buttonColors(
            containerColor = emeraldGreen),

        ) {
            Text("Регистрация")
        }

        Row(Modifier
            .padding(top = 7.dp)
            .align(alignment = Alignment.CenterHorizontally)
        ) {
            Text("Уже есть аккаунт?")
            Text("Войти",modifier = Modifier
                .clickable(onClick = clickable)
            )
        }
    }
}