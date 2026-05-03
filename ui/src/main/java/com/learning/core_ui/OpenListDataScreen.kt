package com.learning.core_ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.core_ui.boxImage.boxWithImage
import com.learning.core_ui.R
@Composable
@Preview
fun OpenListDataScreen() {
    Column() {
        boxWithImage()

        Text("Title", Modifier.padding(top = 10.dp, start = 10.dp))

        Row(Modifier.padding(top = 10.dp,start = 10.dp,end = 10.dp).fillMaxWidth()){
            //Icon(painterResource(R.drawable.ic_action_profile), contentDescription = null)
            Column {
                Text("Автор")
                Text("UserName")
            }
        }

        Box(modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
            Column(Modifier.padding(start = 10.dp,end = 10.dp)) {
                Button(onClick = {},
                    Modifier.fillMaxWidth()) {
                Text("Начать курс")
            }
                Button(onClick = {},
                    modifier =Modifier.padding(top = 5.dp)
                        .fillMaxWidth()) {
                    Text("Перейти на платформу")
                }}
        }

        Text("О курсе",Modifier.padding(top = 15.dp,start = 10.dp))
        Text("SomeBigTEXTDATA...", Modifier.padding(top = 5.dp,start = 10.dp,end = 10.dp))
    }
}