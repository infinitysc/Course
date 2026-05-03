package com.learning.core_ui.boxImage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.core_ui.R

@Composable
@Preview(device = "id:pixel_9_pro")
fun boxWithImage(score : String = "0.0",date : String = "01.04.2022") {
    val state = remember { mutableStateOf(0) }
    Box (modifier = Modifier
        .fillMaxWidth()
        .heightIn(min = 30.dp,max = 120.dp)
        .background(color = Color.Black,shape = RoundedCornerShape(16.dp))
    ) {

        Image(painter = painterResource(R.drawable.bookmarks_24dp),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        //Change icon when we click to him and add to database this favorites course
        Icon(imageVector = if(state.value == 0) {Icons.Default.FavoriteBorder} else {Icons.Default.Favorite} , contentDescription = "",modifier = Modifier
            .clickable(){
                state.value = 1
                if(state.value ==  1) {
                    state.value = 0
                }
            }
            .align(alignment = Alignment.TopEnd)
            .padding(top = 2.dp,end = 2.dp)
            .background(Color.Transparent.copy(alpha = 0.15f), shape = CircleShape)
        )

        Row(modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(start = 10.dp,bottom = 5.dp)
        ) {

            Box(modifier = Modifier
                .background(Color.Transparent.copy(alpha = 0.15f), shape = RoundedCornerShape(4.dp))
            ) {

                Row() {

                    Icon(imageVector = Icons.Default.Star, contentDescription = "",
                        modifier = Modifier
                            .heightIn(min = 10.dp, max = 15.dp))

                    Text("$score",modifier = Modifier
                        .align(Alignment.CenterVertically))
                }
            }

            Box(modifier = Modifier
                .align(Alignment.CenterVertically)

                .padding(start = 8.dp)
                .background(color = Color.Transparent.copy(alpha = 0.15f), shape = RoundedCornerShape(4.dp))
                ) {
                Text("$date")

            }

        }
    }
}