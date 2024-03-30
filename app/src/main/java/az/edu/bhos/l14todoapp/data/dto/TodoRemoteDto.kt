package az.edu.bhos.l14todoapp.data.dto

import az.edu.bhos.l14todoapp.entities.TodoEntity
import kotlinx.serialization.Serializable

// TODO complete the dto class
@Serializable
data class TodoRemoteDto(
    val id: String,
    val title: String,
    val completed: Boolean,
    val weekday: String
) {
    fun toEntity() = TodoEntity(
        id = this.id,
        title = this.title,
        completed = this.completed,
        weekday = this.weekday
    )
}
