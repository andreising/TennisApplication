package com.andrei_singeleytsev.tennisapplication.ui.screen.main_screen

sealed class MainScreenEvent {
    object OnButtonPressed: MainScreenEvent()
}