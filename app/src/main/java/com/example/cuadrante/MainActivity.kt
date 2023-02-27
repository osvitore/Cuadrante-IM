package com.example.cuadrante


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrante.ui.theme.CuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Cuadrante()
                }
            }
        }
    }
}

@Composable
fun Cuadrante() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CuadranteIndv(
                titulo = "Text composable",
                texto = "Displays text and follows Material Design guidelines.",
                fondo = Color.Green,
                modifier = Modifier.weight(1f)
            )
            CuadranteIndv(
                titulo = "Image composable",
                texto = "Creates a composable that lays out and draws a given Painter class object.",
                fondo = Color.Yellow,
                modifier = Modifier.weight(1f)

            )
        }
        Row(Modifier.weight(1f)) {
            CuadranteIndv(
                titulo = "Row composable",
                texto = "A layout composable that places its children in a horizontal sequence.",
                fondo = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            CuadranteIndv(
                titulo = "Column composable",
                texto = "A layout composable that places its children in a vertical sequence.",
                fondo = Color.LightGray,
                modifier = Modifier.weight(1f)

            )
        }
    }
}

@Composable
fun CuadranteIndv(titulo: String, texto: String, fondo: Color, modifier: Modifier = Modifier){
    Column(modifier = modifier
        .fillMaxSize()
        .background(fondo)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = texto,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CuadranteTheme {
        Cuadrante()
    }
}