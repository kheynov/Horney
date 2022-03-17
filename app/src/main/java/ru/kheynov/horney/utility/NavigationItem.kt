package ru.kheynov.horney.utility

import ru.kheynov.horney.R

sealed class NavigationItem(var route: String, var iconId: Int, var title: String) {
    object CardDeck : NavigationItem(route = "deck",
        iconId = R.drawable.ic_collection_icon,
        title = "")

    object Likes : NavigationItem(route = "likes",
        iconId = R.drawable.ic_like_icon,
        title = "")

    object Profile : NavigationItem(route = "profile",
        iconId = R.drawable.ic_user_icon,
        title = "")
}
