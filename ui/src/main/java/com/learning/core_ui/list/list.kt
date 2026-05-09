package com.learning.core_ui.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.learning.core_ui.ui.emeraldGreen
import com.learning.core_ui.boxImage.boxWithImage

@Composable
@Preview(device = "id:pixel_9_pro")
fun PresentationList(
    title : String = "JAVA разработчик с нуля",
    description : String = "Освойте backend-разработку и программирование на Java, фреймворки Spring и Maven, работу с базами данных и API. Создайте свой собственный проект, собрав портфолио и став востребованным специалистом для любой IT компании.",
    price : String = "1000 Р",
    score : String = "4.92",
    date : String = "04.01.2024",
    padding : Dp = 4.dp,
    onTap : () -> Unit = {}
) {
    Box(Modifier
        .fillMaxWidth()
        .background(Color.Gray, shape = RoundedCornerShape(16.dp))
        ) {
        Column() {
            boxWithImage(score = score,date = date)
            Text(title, modifier = Modifier.padding(start = 5.dp,top = 5.dp))
            Text(
                description,
                Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp,top = 5.dp)
                ,overflow = TextOverflow.Ellipsis,
                maxLines = 3
               )
            Row(Modifier.fillMaxWidth()
                .padding(start = 5.dp), horizontalArrangement = Arrangement.SpaceBetween){
                Text(price,Modifier.align(Alignment.Bottom)
                    .padding(bottom = 15.dp))
                    TextButton(onClick = onTap) {
                        Text("Подробнее",)
                        Icon(imageVector = Icons.AutoMirrored.Default.ArrowForward, contentDescription = "")
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfileList(title : String = "JAVA разработчик с нуля",
                score : String = "0.0",
                date : String = "01.04.2022",
                completed : List<String> = listOf("20","25")
) {

    val result = remember(completed) {
        val done = completed.getOrNull(0)?.toFloatOrNull() ?: 0f
        val total = completed.getOrNull(1)?.toFloatOrNull() ?: 1f
        if (total == 0f) 0f else done / total
    }

    Box(Modifier
        .fillMaxWidth()
        .background(Color.Gray, shape = RoundedCornerShape(16.dp))
    ) {
        Column() {
            boxWithImage(score = score, date = date)
            Text(title,Modifier.padding(10.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp,start = 10.dp,end = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text("${(result * 100).toInt()} %")
                Text("${completed.getOrNull(0) ?: "0"}/${completed.getOrNull(1) ?: "0"} уроков")
            }
            
            LinearProgressIndicator(
                progress = { result },
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 10.dp,end = 10.dp,
                        bottom = 10.dp)
                    .height(10.dp),
                color = emeraldGreen,
                trackColor = Color.Black,
            )

        }
    }
}
