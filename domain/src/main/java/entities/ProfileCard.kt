package entities

data class ProfileCard(
    val images: List<String>,
    val name: String = "Null",
    val age: Int = 0,
    val matchTime: String = "19/03/2022",
)