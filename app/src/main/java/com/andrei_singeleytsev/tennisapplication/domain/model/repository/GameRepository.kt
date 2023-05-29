package com.andrei_singeleytsev.tennisapplication.domain.model.repository

import android.icu.text.DateTimePatternGenerator.DisplayWidth

interface GameRepository {
    fun onStart(screenWidth: Float, screenHeight: Float)
}