package com.example.composable_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composable_quadrant.ui.theme.ComposableQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableQuadrantApp()
                }
            }
        }
    }
}


@Composable
fun ComposableQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.q1_title),
                desc = stringResource(id = R.string.q1_desc),
                backgroundColor = colorResource(id = R.color.q1),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(id = R.string.q2_title),
                desc = stringResource(id = R.string.q2_desc),
                backgroundColor = colorResource(id = R.color.q2),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.q3_title),
                desc = stringResource(id = R.string.q3_desc),
                backgroundColor = colorResource(id = R.color.q3),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(id = R.string.q4_title),
                desc = stringResource(id = R.string.q4_desc),
                backgroundColor = colorResource(id = R.color.q4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposableInfoCard(
    title: String,
    desc: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = desc, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableQuadrantTheme {
        ComposableQuadrantApp()
    }
}