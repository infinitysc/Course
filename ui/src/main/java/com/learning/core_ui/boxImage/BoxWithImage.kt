package com.learning.core_ui.boxImage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.core_ui.R

@Composable
@Preview(device = "id:pixel_9_pro")
fun boxWithImage(score: String = "0.0", date: String = "01.04.2022") {
    val isFavorite = remember { mutableStateOf(false) }
    Box(modifier = Modifier
        .fillMaxWidth()
        .heightIn(min = 30.dp, max = 120.dp)
        .background(color = Color.Black, shape = RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(R.drawable.bookmarks_24dp),
            contentDescription = null,
            modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Icon(
            imageVector = if (!isFavorite.value) Icons.Default.FavoriteBorder else Icons.Default.Favorite,
            contentDescription = "Toggle Favorite",
            tint = if (isFavorite.value) Color.Red else Color.White,
            modifier = Modifier
                .clickable { isFavorite.value = !isFavorite.value }
                .align(alignment = Alignment.TopEnd)
                .padding(4.dp)
                .background(Color.Black.copy(alpha = 0.3f), shape = CircleShape)
                .padding(4.dp)
        )

        Row(modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(start = 10.dp, bottom = 5.dp)
        ) {
            Box(modifier = Modifier
                .background(Color.Black.copy(alpha = 0.4f), shape = RoundedCornerShape(4.dp))
                .padding(horizontal = 4.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = Icons.Default.Star, contentDescription = null,
                        modifier = Modifier.size(14.dp), tint = Color.Yellow)
                    Text(score, color = Color.White)
                }
            }

            Box(modifier = Modifier
                .padding(start = 8.dp)
                .background(color = Color.Black.copy(alpha = 0.4f), shape = RoundedCornerShape(4.dp))
                .padding(horizontal = 4.dp)
            ) {
                Text(date, color = Color.White)
            }
        }
    }
}
