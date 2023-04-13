package blind.project.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0017J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lblind/project/controller/TodoController;", "", "service", "Lblind/project/service/TodoService;", "(Lblind/project/service/TodoService;)V", "createTodo", "Lorg/springframework/http/ResponseEntity;", "dto", "Lblind/project/dto/TodoDTO;", "retrieveTodoList", "testTodo", "project"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"todo"})
@org.springframework.web.bind.annotation.RestController()
public class TodoController {
    private final blind.project.service.TodoService service = null;
    
    public TodoController(@org.jetbrains.annotations.NotNull()
    blind.project.service.TodoService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/test"})
    public org.springframework.http.ResponseEntity<?> testTodo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping()
    public org.springframework.http.ResponseEntity<?> createTodo(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    blind.project.dto.TodoDTO dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping()
    public org.springframework.http.ResponseEntity<?> retrieveTodoList() {
        return null;
    }
}