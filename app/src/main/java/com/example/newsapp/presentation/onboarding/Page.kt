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
        title = "‘Voter suppression’ rumors denied",
        description = "The government on Sunday refuted rumors circulating on social media claiming that the government was planning to change..",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Expat numbers surge to 68.3% of Kuwait’s population",
        description = "The total number of non-Kuwaiti residents in Kuwait has witnessed a significant increase, constituting 68.3 percent..",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "PM receives invitation from Saudi Crown Prince to visit the Kingdom",
        description = "His Highness the Prime Minister Sheikh .....",
        image = R.drawable.onboarding3
    )
)
