package com.andrei_singeleytsev.tennisapplication.ui.utils

sealed class UIEvents {
    data class OnNavigate(val route: String): UIEvents()
}