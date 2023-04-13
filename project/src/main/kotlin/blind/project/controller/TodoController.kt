package blind.project.controller

import blind.project.dto.ResponseDTO
import blind.project.dto.TodoDTO
import blind.project.entity.TodoEntity
import blind.project.service.TodoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
@RequestMapping("todo")
class TodoController(
    private final val service: TodoService
) {

    @GetMapping("/test")
    fun testTodo() : ResponseEntity<*> {
        val str = service.testService()
        val list = mutableListOf<String?>()
        list.add(str)
        val response = ResponseDTO<String?>(
            data = list
        )

        return ResponseEntity.ok().body(response)
    }

    @PostMapping
    fun createTodo(@RequestBody dto: TodoDTO) : ResponseEntity<*> {
        try {
            val temporaryUserId = "temporary-user" // temporary user id.

            // (1) TodoEntity로 변환한다.
            val entity = TodoDTO().toEntity(dto)

            // (2) id를 null로 초기화
            entity.id = null

            // (3) 임시 사용자 아이디를 설정해준다.
            entity.userId = temporaryUserId

            // (4) 서비스를 이용해 Todo 엔티티를 생성한다.
            val entities = service.create(entity)


            // (5) 스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
            val dtos =
                entities.stream().map { todo -> TodoDTO(todo) }
                    .collect(Collectors.toList())

            // (6) 변환된 TodoDTO 리스트를 이용해 ReponseDTO 초기화
            val response = ResponseDTO<TodoDTO>(
                data = dtos
            )

            // (7) ResponseDTO를 리턴한다.
            return ResponseEntity.ok().body(response)


        } catch (e: Exception) {
            // 예외발생시 에러를 넣어서 리턴한다.
            return ResponseEntity.badRequest().body(
                ResponseDTO<TodoDTO>(
                    error = e.message
                )
            )
        }
    }

    @GetMapping
    fun retrieveTodoList() : ResponseEntity<*> {
        val temporaryUserId = "temporary-user"

        // (1) 서비스 메서드의 retrieve() 호출하여 Todo 리스트를 가져온다.
        val entities = service.retrieve(temporaryUserId)

        // (2) 스트림을 이용해 TodoDTO 리스트로 변환
        val dtos = entities.stream()
            .map { it -> TodoDTO(it) }
            .collect(Collectors.toList())

        // (3) 변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화 후 반환
        return ResponseEntity.ok().body(ResponseDTO<TodoDTO>(
            data = dtos
        ))
    }
}