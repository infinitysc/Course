package com.learning.core_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.core_ui.list.PresentationList
import com.learning.core_ui.R

@Preview(device = "id:pixel_9_pro")
@Composable
fun MainScreen(){
    Column(Modifier.fillMaxSize().padding(10.dp)) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.SpaceBetween){
            TextField(value = "",
                onValueChange = {},
                modifier = Modifier,
                shape = RoundedCornerShape(16.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "")
                }
            )
            IconButton(onClick = {},modifier = Modifier
                .padding(end = 30.dp, top = 5.dp)
                .background(color = Color.White,shape = CircleShape)) {
                Icon(imageVector = ImageVector.vectorResource(R.drawable.filter_alt), contentDescription = "",
                    modifier = Modifier
                        .heightIn(20.dp,30.dp)
                        .widthIn(20.dp,30.dp)
                )
            }
        }

        TextButton(onClick = {},
            modifier = Modifier
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = com.learning.core_ui.ui.emeraldGreen
            )
        ) {
            Text("По дате добавления")
            Icon(painter = painterResource(R.drawable.up_and_down_arrow),
                contentDescription = "",
                modifier = Modifier
                    .heightIn(10.dp,30.dp)
                    .widthIn(10.dp,30.dp)
            )
        }

        LazyColumn(
            modifier = Modifier.padding(top = 10.dp)
        ) {

        items(count = 1){
            PresentationList {  }
        }

        }
    }
}