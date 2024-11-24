package com.example.aluvery.sampledata

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

// Lista de produtos de exemplo
val sampleProducts = listOf(
    Product(
        name = "Hamburguer", // Nome do produto
        price = BigDecimal("10.99"), // Preço do produto
        image = R.drawable.burger // Imagem do produto
    ),
    Product(
        name = "Fritas",
        price = BigDecimal("8.99"),
        image = R.drawable.fries
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("30.99"),
        image = R.drawable.pizza
    )
)

// Lista de produtos mais vendidos de exemplo
val sampleProductsTopSeller = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("5.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Fritas",
        price = BigDecimal("3.99"),
        image = R.drawable.fries
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("20.99"),
        image = R.drawable.pizza
    )
)