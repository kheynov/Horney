package repository

import entities.ProfileCard

interface CardsRepository {
    fun getProfileCards(): List<ProfileCard>
}