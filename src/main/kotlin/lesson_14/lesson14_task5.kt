package org.example.lesson_14

class Chat {
    private val messages: MutableList<Message> = mutableListOf()
    private var nextMessageId = 1

    fun addMessage(text: String, author: String) {
        messages.add(
            Message(
                id = nextMessageId++,
                textMessage = text,
                authorMessage = author,
            )
        )
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        messages.add(
            ChildMessage(
                id = nextMessageId++,
                textMessage = text,
                authorMessage = author,
                parentMessageId = parentMessageId,
            )
        )
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }
        groupedMessages.forEach { (_, messagesGroup) ->
            messagesGroup.forEach { message ->
                if (message is ChildMessage) {
                    println("\t${message.authorMessage}: ${message.textMessage}")
                } else {
                    println("${message.authorMessage}: ${message.textMessage}")
                }
            }
        }
    }
}

open class Message(
    val id: Int,
    val textMessage: String,
    val authorMessage: String,
)

class ChildMessage(
    id: Int,
    textMessage: String,
    authorMessage: String,
    val parentMessageId: Int,
) : Message(id, textMessage, authorMessage)

fun main() {
    val chat = Chat()

    chat.addMessage("Первая тема: Знакомство", "Александр")
    chat.addThreadMessage("Привет, я Саша", "Cаша", 1)
    chat.addThreadMessage("Привет, я Шура", "Шура", 1)
    chat.addMessage("Вторая тема: Прощание", "Валя")
    chat.addThreadMessage("Пока, Валя", "Валентин", 4)

    chat.printChat()
}

