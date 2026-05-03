package com.learning.core_ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.learning.core_ui.list.ProfileList

@UiComposable
@Composable
@Preview
fun ProfileScreen() {
    BoxWithConstraints(Modifier.fillMaxSize()) {
        val width = remember {maxWidth}
        val height = remember {maxHeight}
        content()
    }
}


@Composable
fun content() {
    val testList = listOf<test>(
        test("java","gffdfdfd","100"),
        test(title = "python","авававав0фпзштфждщлматдолфамдолфамдолафмждлтмфждломтифждлвм","134413")
    )

    Column(Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp, top = 25.dp,),
        )
    {

        Text("Профиль", fontSize = TextUnit(5f, TextUnitType.Em))
        boxElements()

        Text("Ваши курсы",Modifier.padding(top = 15.dp), fontSize = TextUnit(5f, TextUnitType.Em))
        LazyColumn(modifier = Modifier
            .padding(top = 10.dp),
            verticalArrangement = Arrangement.Center) {
            items(testList.size) { it ->
                ProfileList()
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}
data class test(
    val title : String,
    val description : String,
    val price : String
)
@Composable
fun boxElements(isLogin : Boolean = true) {
    Box(Modifier
        .fillMaxWidth()
        .padding(
            top = 15.dp,
            bottom = 15.dp)
        .background(Color.Gray)) {
        Column() {

            boxElement("Написать в поддержку") { }
            HorizontalDivider(modifier = Modifier, thickness = 1.dp, color = Color.White)
            boxElement("Настройки") { }

            HorizontalDivider(modifier = Modifier, thickness = 1.dp, color = Color.White)

            if(isLogin) {
                boxElement("Выйти из аккаунта") { }
            }else {
                boxElement("Войти в аккаунт") { }
            }
        }

        }

    }


@Composable
fun boxElement(title : String,onClick : () -> Unit) {
    TextButton(onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(contentColor = Color.Black, containerColor = Color.Transparent)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(title)
            Icon(
                imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight,
                contentDescription = ""
            )
        }
    }
}

