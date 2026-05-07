package org.example.lesson_11

class Forum(
    private val members: MutableList<ForumMember> = mutableListOf(),
    private val messages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(userName: String): ForumMember {
        val userId = members.size + 1

        val newUser = ForumMember.Builder()
            .setUserId(userId)
            .setUserName(userName)
            .build()

        members += newUser

        return newUser
    }

    fun createNewMessage(userId: Int, message: String) {
        if (members.any { it.userId == userId }) {

            val newMessage = ForumMessage.Builder()
                .setAuthorId(userId)
                .setMessage(message)
                .build()

            messages += newMessage
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = members.find { it.userId == message.authorId }
            if (author != null) print("${author.userName}: ${message.message} ")
        }
    }
}

class ForumMember private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        private var userId: Int = 0
        private var userName: String = ""

        fun setUserId(userId: Int) = apply {
            this.userId = userId
        }

        fun setUserName(userName: String) = apply {
            this.userName = userName
        }

        fun build(): ForumMember {
            return ForumMember(userId, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(authorId: Int) = apply {
            this.authorId = authorId
        }

        fun setMessage(message: String) = apply {
            this.message = message
        }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Ибрагим")
    val user2 = forum.createNewUser("Эдуард")

    forum.createNewMessage(user1.userId, "Фтопку!")
    forum.createNewMessage(user1.userId, "Аффтар, пеши исчо!")

    forum.createNewMessage(user2.userId, "Превед, медвед!")
    forum.createNewMessage(user2.userId, "Йа креведко!")

    forum.printThread()
}
