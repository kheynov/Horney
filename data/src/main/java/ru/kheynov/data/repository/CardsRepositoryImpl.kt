package ru.kheynov.data.repository

import entities.ProfileCard
import repository.CardsRepository

class CardsRepositoryImpl : CardsRepository {
    override fun getProfileCards(): List<ProfileCard> {
        return mutableListOf(
            ProfileCard(
                images = listOf("https://picsum.photos/800/1000"),
                name = "Anna",
                age = 21,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/850/1000"),
                name = "Maria",
                age = 24,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/800/1200"),
                name = "Viktoria",
                age = 19,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/800/900"),
                name = "Vitaliy",
                age = 20,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/810/1000"),
                name = "Igor'",
                age = 21,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/830/1000"),
                name = "Samuel",
                age = 50,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/870/1200"),
                name = "Kyle",
                age = 18,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
            ProfileCard(
                images = listOf("https://picsum.photos/890/900"),
                name = "Smith",
                age = 29,
                aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            ),
        )
    }
}