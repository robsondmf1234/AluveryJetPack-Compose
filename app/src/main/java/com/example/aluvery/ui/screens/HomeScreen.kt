package com.example.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.sampledata.sampleProducts
import com.example.aluvery.sampledata.sampleProductsTopSeller
import com.example.aluvery.ui.components.ProductsSection

// Função composable que define a tela inicial do aplicativo
@Composable
fun HomeScreen() {
    // Coluna que ocupa todo o tamanho disponível e permite rolagem vertical
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        // Espaçador para adicionar espaço no início da coluna
        Spacer(Modifier)
        // Seção de produtos com o título "Promoções" e uma lista de produtos de exemplo
        ProductsSection(title = "Promoções", sampleProducts)
        // Seção de produtos com o título "Doces" e uma lista de produtos mais vendidos
        ProductsSection(title = "Doces", sampleProductsTopSeller)
        // Seção de produtos com o título "Bebidas" e uma lista de produtos de exemplo
        ProductsSection(title = "Bebidas", sampleProducts)
        // Espaçador para adicionar espaço no final da coluna
        Spacer(Modifier)
    }
}

// Função composable para pré-visualizar a tela inicial
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}