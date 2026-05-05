package org.example.lesson_11

enum class SpeakingStatus {
    SPEAKING,
    MIC_OFF,
    MUTED,
}

data class User3(
    val username: String,
    val avatarUrl: String?,
)

data class Participant(
    val user: User3,
    var speakingStatus: SpeakingStatus,
)

class Room(
    val thumbnail: Int,
    val name: String,
    private val participants: MutableList<Participant> = mutableListOf(),
) {

    fun addParticipant(participant: Participant) {
        participants += participant
    }

    fun updateParticipantStatus(username: String, newStatus: SpeakingStatus) {
        participants
            .find { it.user.username == username }
            ?.speakingStatus = newStatus
    }

}


fun main() {
    val user1 = User3("Шурик", null)
    val user2 = User3("Санёк", "http://server")
    val user3 = User3("Александр Сергеевич", "http://server")

    val room1 = Room(33554354, "Александры всех стран")

    room1.addParticipant(Participant(user1, SpeakingStatus.MIC_OFF))
    room1.addParticipant(Participant(user2, SpeakingStatus.MIC_OFF))
    room1.addParticipant(Participant(user3, SpeakingStatus.MIC_OFF))

    room1.updateParticipantStatus("Шурик", SpeakingStatus.SPEAKING)
    room1.updateParticipantStatus("Санёк", SpeakingStatus.MUTED)
}