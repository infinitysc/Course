package com.learning.core_ui.login

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.learning.core_ui.R
import com.learning.core_ui.ui.Typography
import com.learning.core_ui.ui.emeraldGreen
import com.learning.core_ui.ui.royalBlue
import com.learning.core_ui.ui.orange

@Preview(device = "id:pixel_9_pro", uiMode = Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun LoginScreen(maxWidth: Dp = 400.dp) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(Modifier
        .padding(top = 50.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
        .fillMaxWidth()
    ) {
        Text(stringResource(R.string.login), style = Typography.titleLarge)

        Column(Modifier.padding(top = 25.dp)) {
            Text("Email")
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier.padding(top = 7.dp).fillMaxWidth(),
                placeholder = { Text("example@example.com") },
                singleLine = true,
                shape = RoundedCornerShape(10.dp)
            )

            Text(stringResource(R.string.password), Modifier.padding(top = 10.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.padding(top = 7.dp).fillMaxWidth(),
                placeholder = { Text("Введите пароль") },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true,
                shape = RoundedCornerShape(10.dp)
            )

            Button(
                onClick = { /* TODO: API call */ },
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(containerColor = emeraldGreen)
            ) {
                Text("Войти")
            }

            Row(Modifier.padding(top = 15.dp).align(Alignment.CenterHorizontally)) {
                Text("Нет аккаунта? ")
                Text(
                    "Зарегистрироваться",
                    color = emeraldGreen,
                    modifier = Modifier.clickable { /* Navigate to Reg */ }
                )
            }
            Text(
                "Забыл пароль",
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 8.dp),
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

        Row(Modifier.padding(top = 20.dp).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Button(
                onClick = {},
                modifier = Modifier.weight(1f).height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = orange),
                shape = RoundedCornerShape(12.dp)
            ) { Text("Google") }
            
            Button(
                onClick = {},
                modifier = Modifier.weight(1f).height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = royalBlue),
                shape = RoundedCornerShape(12.dp)
            ) { Text("VK") }
        }
    }
}
