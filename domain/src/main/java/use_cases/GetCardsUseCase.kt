package use_cases

import entities.ProfileCard
import repository.CardsRepository

class GetCardsUseCase(
    private val cardsRepository: CardsRepository,
) {
    operator fun invoke(): List<ProfileCard> {
        return cardsRepository.getProfileCards()
    }
}