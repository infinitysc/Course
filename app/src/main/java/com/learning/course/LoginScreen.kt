package com.learning.course

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.learning.course.ui.theme.Typography
import com.learning.course.ui.theme.emeraldGreen
import com.learning.course.ui.theme.orange
import com.learning.course.ui.theme.royalBlue
import com.learning.course.R

@Preview(device = "id:pixel_9_pro", uiMode = Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun LoginScreen(maxWidth : Dp = 400.dp) {
    Column(Modifier
        .padding(top = 50.dp)
        .padding(all = 10.dp)
        .fillMaxWidth()
    )
    {
        Text("Вход", style = Typography.titleLarge)

        Column(Modifier.padding(top = 25.dp)) {
            Text("Email")
            TextField(
                value = "example@example.com", onValueChange = {},
                Modifier
                    .padding(top = 7.dp)
                    .fillMaxWidth()
            )

            Text("пароль", Modifier.padding(top = 10.dp))
            TextField(
                value = "Введите пароль", onValueChange = {},
                Modifier
                    .padding(top = 7.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp)

            )

            Button(
                onClick = {}, Modifier.width(((maxWidth * 0.5F) * 1.2F))
                    .padding(top = 10.dp)
                    .align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(
                    containerColor = emeraldGreen
                )
            ) { }

            Row(
                Modifier
                    .padding(top = 7.dp)
                    .align(Alignment.CenterHorizontally)

            ) {
                Text("Уже есть аккаунт?")
                Text(
                    "Войти", modifier = Modifier
                        .clickable(onClick = {})
                )
            }
            Text("Забыл пароль", Modifier.align(Alignment.CenterHorizontally).padding(4.dp))
        }

        HorizontalDivider(modifier = Modifier, thickness = 1.dp,color = Color.White)

        Row(Modifier
            .padding(top = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {},Modifier
                .size(height = 55.dp, width = (maxWidth * 0.5F) * 0.9F),
                colors = ButtonDefaults.buttonColors(
                    containerColor = orange
                )){

            }
            Button(onClick = {},Modifier
                .size(height = 55.dp, width = (maxWidth * 0.5F) * 0.9F),
                colors = ButtonDefaults.buttonColors(
                    containerColor = royalBlue)
            ){

            }
        }
    }


}