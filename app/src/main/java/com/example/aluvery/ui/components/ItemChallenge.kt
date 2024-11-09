package com.example.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(
    showBackground = true
)
fun ChallengeComposable() {
    Row {
        Box(
            modifier = Modifier
                .height(100.dp)
                .width(90.dp)
                .background(Color.Blue)
        ) {}
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .height(30.dp), text = "Texto 1")
            Text(text = "Texto 2")
        }
    }
}
