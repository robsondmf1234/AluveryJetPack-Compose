package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    showBackground = true
)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(
    showBackground = true
)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(
    showBackground = true,
)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomLayoutPreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box {
            Text(text = "Texto 5")
            Text(text = "Texto 6")
        }
    }
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
