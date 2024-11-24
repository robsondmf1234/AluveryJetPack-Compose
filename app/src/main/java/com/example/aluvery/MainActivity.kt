package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.ui.screens.HomeScreen
import com.example.aluvery.ui.theme.AluveryTheme

// MainActivity é uma subclasse de ComponentActivity
class MainActivity : ComponentActivity() {
    // onCreate é chamado quando a atividade está sendo iniciada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContent define a visualização do conteúdo da atividade
        setContent {
            // Chama a função composable App para definir a interface do usuário
            App()
        }
    }
}

// App é uma função composable que define o tema e o conteúdo do aplicativo
@Composable
fun App() {
    // Aplica o tema AluveryTheme ao conteúdo
    AluveryTheme {
        // Surface é um contêiner que usa a cor de fundo do tema
        Surface {
            // Chama a função composable HomeScreen para exibir a tela inicial
            HomeScreen()
        }
    }
}

// AppPreview é uma função composable para pré-visualizar o composable App na visualização do Android Studio
@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
private fun AppPreview() {
    // Chama a função composable App para exibir a pré-visualização
    App()
}