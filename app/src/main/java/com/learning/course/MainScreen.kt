package com.learning.course

import android.graphics.drawable.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.learning.course.R
import com.learning.course.list.PresentationList


@Preview(device = "id:pixel_9_pro")
@Composable
fun MainScreen(){
    Column(Modifier.fillMaxSize().padding(10.dp)) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier,
                shape = RoundedCornerShape(16.dp),
                leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "")}
            )
            Icon(imageVector = ImageVector.vectorResource(com.learning.course.R.drawable.ic_twotone_filter), contentDescription = "",
                modifier = Modifier
                    .heightIn(10.dp,30.dp)
                    .widthIn(10.dp,30.dp),
            )
        }

        TextButton(onClick = {},
            modifier = Modifier
                .align(Alignment.End)
        ) {
            Text("По дате добавления")
            Icon(painter = painterResource(com.learning.course.R.drawable.up_down_arrow),
                contentDescription = ""
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