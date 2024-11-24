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

// Função composable para exibir um item de produto de desafio
@Composable
fun ProductItemChallenge() {
    // Surface é um contêiner que aplica elevação e forma arredondada
    Surface(
        shape = RoundedCornerShape(15.dp), shadowElevation = 8.dp
    ) {
        // Column é um contêiner que organiza seus filhos em uma coluna vertical
        Column(
            modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
                .verticalScroll(rememberScrollState())
        ) {
            val imageSize = 100.dp
            // Box é um contêiner que empilha seus filhos
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
                // Image exibe uma imagem com borda e forma circular
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
            // Spacer adiciona um espaço vertical entre os elementos
            Spacer(modifier = Modifier.height(imageSize / 2))
            // Column para organizar textos dentro do item de produto
            Column(modifier = Modifier.padding(8.dp)) {
                // Text exibe um texto com estilo e overflow
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                // Text exibe o preço do produto
                Text(
                    text = "R$ 14,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
            // Spacer adiciona um espaço vertical entre os elementos
            Spacer(modifier = Modifier.height(60.dp))
            // Box para exibir um texto com fundo colorido
            Box(
                modifier =
                Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF0000CD))
            ) {
                // Text exibe um texto com estilo e cor branca
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

// Função composable para pré-visualizar a seção de produtos de desafio
@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun ProductsSectionChallengePreview() {
    // Column é um contêiner que organiza seus filhos em uma coluna vertical
    Column {
        // Text exibe o título da seção
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
        // Row é um contêiner que organiza seus filhos em uma linha horizontal
        Row(
            modifier = Modifier
                .padding(bottom = 16.dp, top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Spacer adiciona um espaço horizontal entre os elementos
            Spacer(Modifier)
            // Exibe três itens de produto de desafio
            ProductItemChallenge()
            ProductItemChallenge()
            ProductItemChallenge()
            // Spacer adiciona um espaço horizontal entre os elementos
            Spacer(Modifier)
        }
    }
}