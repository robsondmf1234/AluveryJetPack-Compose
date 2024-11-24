package com.example.aluvery.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

// Extensão para a classe BigDecimal que converte o valor para a moeda brasileira
fun BigDecimal.toBrazilianCurrency(): String {
    // Formata o valor BigDecimal como moeda brasileira (Real)
    return NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(this)
}