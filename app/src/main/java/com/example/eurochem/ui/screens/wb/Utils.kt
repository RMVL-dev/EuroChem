package com.example.eurochem.ui.screens.wb

import androidx.compose.ui.graphics.Brush
import com.example.eurochem.ui.theme.Pink40
import com.example.eurochem.ui.theme.Purple40
import com.example.eurochem.ui.theme.gradientStart
import com.example.eurochem.ui.theme.gradientEnd

fun getBackgroundBrush():Brush = Brush.verticalGradient(
    colors = listOf(gradientEnd, gradientStart),
    startY = -300f
)

fun getCardBrush():Brush = Brush.linearGradient(
    colors = listOf(Purple40, Pink40)
)