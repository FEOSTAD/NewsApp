package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Kuwait opens investment conf in London",
        description = "LONDON: A Kuwait investment conference was launched in London on Tuesday as part of celebrations of 125 years of Kuwait-UK..",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Kane’s double powers Bayern into Champions League last 8",
        description = "MUNICH: Harry Kane scored a goal in each half as Bayern Munich beat Lazio 3-0 on Tuesday to reach the Champions League..",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Home gardening: A labor of love",
        description = "With its vibrantly colorful fruits, blissfully scented flowers and mouthwatering fresh vegetables, the backyard garden..",
        image = R.drawable.onboarding3
    )
)
