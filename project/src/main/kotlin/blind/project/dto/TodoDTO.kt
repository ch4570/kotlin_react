package blind.project.dto

import blind.project.entity.TodoEntity

class TodoDTO (
    var id: String? = null,
    var title: String? = null,
    var done: Boolean = false
        ) {

    constructor(entity: TodoEntity) : this(entity.id, entity.title, entity.done)

    fun toEntity(dto: TodoDTO) =
        TodoEntity(
            id = dto.id,
            title = dto.title,
            done = dto.done
        )
}