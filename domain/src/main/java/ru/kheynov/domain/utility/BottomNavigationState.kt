package ru.kheynov.domain.utility

sealed class BottomNavigationState{
    object MainScreen : BottomNavigationState()
    object LikesScreen : BottomNavigationState()
    object ProfileScreen : BottomNavigationState()
}