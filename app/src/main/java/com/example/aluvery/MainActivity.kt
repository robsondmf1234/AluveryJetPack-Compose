package com.example.aluvery

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.ui.theme.AluveryTheme

//TODO("https://cursos.alura.com.br/course/jetpack-compose-app-android/task/110172")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    MyFirstComposable()
                }
            }
        }
    }
}


@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro Text")
    Text(text = "Meu segundo Text")
}

@Preview(
    name = "Preview DarkMode",
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "Preview LightMode",
    showSystemUi = true,
)
@Composable
fun MyFirstComposablePreview() {
    AluveryTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MyFirstComposable()
        }
    }
}
