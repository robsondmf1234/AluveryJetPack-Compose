package com.example.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R

@Composable
@Preview(
    showBackground = true, showSystemUi = true,
)
fun ItemChallenge() {
    Surface(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        shadowElevation = 8.dp
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(100.dp)
                    .fillMaxHeight()
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(Color(0xFF3700B3), Color(0xFFBB86FC))
                        )
                    )
            ) {
                Image(
                    modifier = Modifier
                        .size(90.dp)
                        .offset(x = 50.dp)
                        .clip(shape = CircleShape)
                        .align(Alignment.Center)
                        .border(
                            width = 2.dp, shape = CircleShape, brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xFF3700B3), Color(0xFFBB86FC)
                                )
                            )
                        ),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(70.dp))
            Text(
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp, end = 24.dp),
                maxLines = 6,
                overflow = TextOverflow.Ellipsis,
                text = LoremIpsum(20).values.first(),
                fontSize = 18.sp,
                fontWeight = FontWeight(500)
            )
        }
    }
}