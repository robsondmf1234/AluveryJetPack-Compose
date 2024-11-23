package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.extensions.toBrazilianCurrency
import com.example.aluvery.model.Product
import com.example.aluvery.ui.theme.AluveryTheme
import java.math.BigDecimal

//TODO("https://cursos.alura.com.br/course/jetpack-compose-app-android/task/110181")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    AluveryTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Spacer(Modifier)
                productsSectionPreview()
                productsSectionPreview()
                productsSectionPreview()
                Spacer(Modifier)
            }
        }
    }
}

@Composable
fun ProductsSection() {
    Column {
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                ),
            text = "Promoções",
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .padding(
                    top = 8.dp
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier)
            ProductItem(
                Product(
                    name = "Hamburguer",
                    price = BigDecimal("17.99"),
                    R.drawable.burger
                )
            )
            ProductItem(
                Product(
                    name = "Fritas",
                    price = BigDecimal("20.99"),
                    image = R.drawable.fries
                )
            )
            ProductItem(
                Product(
                    name = "Pizza",
                    price = BigDecimal("30.99"),
                    image = R.drawable.pizza
                )
            )
            Spacer(Modifier)
        }
    }
}


@Composable
fun ProductItem(product: Product) {
    Surface(
        shape = RoundedCornerShape(15.dp), shadowElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
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
                    painter = painterResource(product.image),
                    contentDescription = null,
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = product.price.toBrazilianCurrency(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
private fun AppPreview() {
    App()
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
            name = "Produto 1",
            price = BigDecimal("10,00"),
            R.drawable.ic_launcher_foreground
        )
    )
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun productsSectionPreview() {
    ProductsSection()
}

