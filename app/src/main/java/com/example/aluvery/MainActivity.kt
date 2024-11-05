package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme

//TODO("https://cursos.alura.com.br/course/jetpack-compose-app-android/task/110174")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    CustomLayoutPreview()
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight( )
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(Modifier
            .padding(8.dp)
            .background(color = Color.Red)
            .padding(all = 8.dp)) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box {
            Row {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
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
