package use_cases

import entities.Profile
import repository.ProfileRepository

class GetProfileUseCase(
    private val profileRepository: ProfileRepository,
) {
    operator fun invoke(): Profile {
        return profileRepository.getProfile()
    }
}