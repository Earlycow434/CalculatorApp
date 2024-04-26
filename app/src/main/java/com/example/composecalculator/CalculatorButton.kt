package com.example.composecalculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 40.sp,
            color = Color.White
        )
    }
}

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit,
    color: Color,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 40.sp,
            color = color,
        )
    }
}
@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit,
    alignment: Alignment,
) {
    Box(
        contentAlignment = alignment,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 40.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 30.dp)
        )
    }
}

