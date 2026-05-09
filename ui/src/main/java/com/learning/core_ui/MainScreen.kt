package com.learning.core_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
import com.learning.core_ui.ui.emeraldGreen

@Preview(device = "id:pixel_9_pro")
@Composable
fun MainScreen() {
    var searchQuery by remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier.weight(1f),
                placeholder = { Text("Поиск курсов...") },
                shape = RoundedCornerShape(16.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                },
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            
            IconButton(
                onClick = { /* TODO: Filter */ },
                modifier = Modifier
                    .size(48.dp)
                    .background(color = Color.White, shape = CircleShape)
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.filter_alt),
                    contentDescription = "Фильтр",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Black
                )
            }
        }

        TextButton(
            onClick = { /* TODO: Sort */ },
            modifier = Modifier.align(Alignment.End).padding(vertical = 8.dp),
            colors = ButtonDefaults.textButtonColors(contentColor = emeraldGreen)
        ) {
            Text("По дате добавления")
            Icon(
                painter = painterResource(R.drawable.up_and_down_arrow),
                contentDescription = null,
                modifier = Modifier.padding(start = 4.dp).size(16.dp)
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(5) { // Имитация списка
                PresentationList(onTap = { /* TODO: Navigate to details */ })
            }
        }
    }
}
