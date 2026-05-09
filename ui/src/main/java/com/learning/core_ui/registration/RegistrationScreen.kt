package com.learning.core_ui.registration

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.learning.core_ui.ui.emeraldGreen
import com.learning.core_ui.ui.orange
import com.learning.core_ui.ui.royalBlue
import com.learning.core_ui.ui.Typography

@Preview
@Composable
fun RegistrationScreen(maxWidth: Dp = 400.dp) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(top = 40.dp,start = 16.dp,end = 16.dp, bottom =  16.dp).fillMaxSize()) {
        Text("Регистрация", style = Typography.titleLarge)

        Column(Modifier.padding(vertical = 20.dp)) {
            Text("Email")
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier.padding(top = 7.dp).fillMaxWidth(),
                placeholder = { Text("example@example.com") },
                shape = RoundedCornerShape(10.dp)
            )

            Text("Пароль", Modifier.padding(top = 10.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.padding(top = 7.dp).fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                shape = RoundedCornerShape(10.dp)
            )

            Text("Повторите пароль", Modifier.padding(top = 10.dp))
            TextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                modifier = Modifier.padding(top = 7.dp).fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                shape = RoundedCornerShape(10.dp)
            )

            Button(
                onClick = { /* TODO: Register logic */ },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(0.7f),
                colors = ButtonDefaults.buttonColors(containerColor = emeraldGreen)
            ) {
                Text("Зарегистрироваться")
            }

            Row(modifier = Modifier
                .padding(top = 15.dp)
                .align(Alignment.CenterHorizontally)
            ) {
                Text("Уже есть аккаунт? ")
                Text("Войти", color = emeraldGreen, modifier = Modifier.clickable { /* Navigate to Login */ })
            }
        }

        HorizontalDivider(thickness = 1.dp, color = Color.LightGray)

        Row(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)) {
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
