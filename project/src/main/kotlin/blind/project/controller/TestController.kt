package blind.project.controller

import blind.project.dto.ResponseDTO
import blind.project.dto.TestRequestBodyDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("test")
class TestController {



    @GetMapping("/testRequestBody")
    fun testController(@RequestBody testRequestBodyDTO: TestRequestBodyDTO) =
        "Hello World! ID ${testRequestBodyDTO.id} Message : ${testRequestBodyDTO.message}"

    @GetMapping("/testResponseBody")
    fun testControllerResponseBody(): ResponseDTO<String> {
        val list = mutableListOf<String>()
        list.add("Hello World! I'm ResponseDTO")

        return ResponseDTO(
            data = list
        )
    }

    @GetMapping("/testResponseEntity")
    fun testControllerResponseEntity(): ResponseEntity<*> {
        val list = mutableListOf<String>()
        list.add("Hello World! I'm ResponseEntity. And you got 400!")

        val response = ResponseDTO<String>(
            data = list
        )

        return ResponseEntity.badRequest().body(list)
    }
}