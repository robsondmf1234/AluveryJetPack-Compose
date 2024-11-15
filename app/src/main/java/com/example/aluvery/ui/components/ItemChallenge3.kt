package com.example.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
fun ProductItemChallenge() {
    Surface(
        shape = RoundedCornerShape(15.dp), shadowElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
                .verticalScroll(rememberScrollState())
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(imageSize)
                    .fillMaxWidth()
                    .background(
                        brush = Brush
                            .horizontalGradient(
                                listOf(Color(0xFF6200EE), Color(0xFF03DAC5))
                            )
                    )
            ) {
                Image(
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter),
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "R$ 14,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
            Spacer(modifier = Modifier.height(60.dp))
            Box(
                modifier =
                Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF0000CD))
            ) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 20.sp,
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(
                        start = 16.dp,
                        top = 8.dp,
                        bottom = 16.dp,
                        end = 16.dp
                    )
                )
            }
        }
    }
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun ProductsSectionChallengePreview() {
    Column {
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp
                ),
            text = "Promoções Desafio",
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .padding(bottom = 16.dp, top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier)
            ProductItemChallenge()
            ProductItemChallenge()
            ProductItemChallenge()
            Spacer(Modifier)
        }
    }
}