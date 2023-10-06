package com.example.composekelasb

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composekelasb.ui.theme.ComposekelasbTheme


private val Any.CenterHorizontally: Alignment.Horizontal
    get() {

    }

@Composable
fun TampilText(message: String, from:String, modifier: Modifier=Modifier) {
    Column (verticalArrangement = Arrangement.Center,
        modifier = modifier) {
        Text(
            color = Color.Blue,
            text = message,
            fontsize = 80.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )
        Text(
            color = Color.Red,
            text = from,
            fontsize = 60.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = AlignmentLine.CenterHorizontally)
        )
    }
}

fun Text(color: Color, text: String, fontsize: TextUnit, lineHeight: TextUnit, textAlign: TextAlign) {

}

fun Text(color: Color, text: String, fontsize: TextUnit, modifier: Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposekelasbTheme {
        TampilText(message ="Selamat Siang", from = "Dari UMY")
    }
}