package ru.kheynov.domain.utility

sealed class BottomNavigationState{
    object CardDeckScreen : BottomNavigationState()
    object LikesScreen : BottomNavigationState()
    object ProfileScreen : BottomNavigationState()
}