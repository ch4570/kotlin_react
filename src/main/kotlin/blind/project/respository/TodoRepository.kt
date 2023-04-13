package blind.project.respository

import blind.project.entity.TodoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface TodoRepository: JpaRepository<TodoEntity, String> {
    @Query("select t from TodoEntity t where t.userId = :userId")
    fun findByUserId(@Param("userId") userId: String?): List<TodoEntity>
}