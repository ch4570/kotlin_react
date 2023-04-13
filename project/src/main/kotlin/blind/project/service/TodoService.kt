package blind.project.service

import blind.project.entity.TodoEntity
import blind.project.respository.TodoRepository
import org.slf4j.LoggerFactory
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.util.StringUtils

@Service
class TodoService(
    private final val repository: TodoRepository
) {

    private val logger = LoggerFactory.getLogger(javaClass)

    fun testService() : String? {

        // TodoEntity 생성
        val entity = TodoEntity(
            title = "My First todo item"
        )

        // TodoEntity 저장
        repository.save(entity)

        // TodoEntity 검색
        val savedEntity = repository.findByIdOrNull(entity.id)

        return savedEntity?.title
    }

    fun create(entity: TodoEntity): List<TodoEntity> {
        // Validations
        validate(entity)

        repository.save(entity)

        logger.info("Entity Id: {} is saved. ", entity.id)

        return repository.findByUserId(entity.userId)
    }

    fun retrieve(userId: String) = repository.findByUserId(userId)

    private fun validate(entity: TodoEntity?) {
        if (entity == null) {
            logger.warn("Entity cannot be null.")
            throw RuntimeException("Entity cannot be null")
        }

        if(!StringUtils.hasText(entity.userId)) {
            logger.warn("Unknown user.")
            throw RuntimeException("Unknown user.")
        }

    }
}