package repository

import entities.Profile

interface ProfileRepository {
    fun getProfile(): Profile
}