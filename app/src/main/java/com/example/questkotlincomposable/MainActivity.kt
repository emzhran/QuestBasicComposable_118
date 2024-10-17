package com.example.questkotlincomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questkotlincomposable.ui.theme.QuestKotlinComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestKotlinComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicKotlin(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicKotlin(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Login",
            style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif),
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(text = "Ini adalah halaman login")
        Image(painter = painterResource(id = R.drawable.umy), contentDescription = "", Modifier.padding(top = 40.dp).size(200.dp))
        Text(text = "Nama")
        Text(text = "Mohammad Zachran Zachary")
        Text(text = "20220140118")

        Image(painter = painterResource(id = R.drawable.emzhrn), contentDescription = "")

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestKotlinComposableTheme {
        BasicKotlin()
    }
}