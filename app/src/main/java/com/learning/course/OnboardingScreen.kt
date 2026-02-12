package com.learning.course

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun OnboardingScreen() {
    Column() {
        Text("Тысячи курсов в одном месте")
        Box() {
            Column() {
                OneRow()
                OneRow()
                OneRow()
                OneRow()
            }
        }
        Button(onClick = {}) {}
    }
}

@Composable
fun OneRow(list : List<String> = listOf("one","two","three"),modifierRotate : Modifier = Modifier) {
    Row() {
        Text(list[0],)
        Text(list[1], modifier = modifierRotate)
        Text(list[2])
    }
}