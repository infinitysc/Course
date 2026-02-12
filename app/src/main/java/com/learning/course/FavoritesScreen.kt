package com.learning.course

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.learning.course.list.PresentationList

@Preview
@Composable
fun FavoritesScreen(){
    Column(modifier = Modifier
        .padding(start = 10.dp,top = 25.dp,end = 10.dp)
        .fillMaxSize()
    ) {

        Text("Избранное", fontSize = TextUnit(5f, TextUnitType.Em))

        LazyColumn(modifier = Modifier.padding(top = 10.dp)) {
            items(1) {
                PresentationList() {  }
                Spacer(modifier = Modifier.height(10.dp))
            }
        }


    }
}