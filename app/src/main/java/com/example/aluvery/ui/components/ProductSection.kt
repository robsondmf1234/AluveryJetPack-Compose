package com.example.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.model.Product
import com.example.aluvery.sampledata.sampleProducts
import com.example.aluvery.sampledata.sampleProductsTopSeller

// Função composable para exibir uma seção de produtos com um título e uma lista de produtos
@Composable
fun ProductsSection(title: String, products: List<Product>) {
    Column {
        // Exibe o título da seção
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                ),
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        // Exibe uma linha horizontal de produtos que pode ser rolada
        Row(
            modifier = Modifier
                .padding(
                    top = 8.dp
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Adiciona um espaço no início da linha
            Spacer(Modifier)
            // Itera sobre a lista de produtos e exibe cada um usando a função ProductItem
            for (p in products) {
                ProductItem(p)
            }
            // Adiciona um espaço no final da linha
            Spacer(Modifier)
        }
    }
}

// Função composable para pré-visualizar a seção de produtos com diferentes listas de produtos
@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun ProductsSectionPreview() {
    ProductsSection(title = "Promoções", products = sampleProducts)
    ProductsSection(title = "Mais Pedidos", products = sampleProductsTopSeller)
    ProductsSection(title = "Novos Produtos", products = sampleProducts)
}