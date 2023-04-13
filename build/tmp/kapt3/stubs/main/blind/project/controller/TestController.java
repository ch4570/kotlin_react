package blind.project.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0017J\f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0017\u00a8\u0006\u000b"}, d2 = {"Lblind/project/controller/TestController;", "", "()V", "testController", "", "testRequestBodyDTO", "Lblind/project/dto/TestRequestBodyDTO;", "testControllerResponseBody", "Lblind/project/dto/ResponseDTO;", "testControllerResponseEntity", "Lorg/springframework/http/ResponseEntity;", "project"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"test"})
@org.springframework.web.bind.annotation.RestController()
public class TestController {
    
    public TestController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/testRequestBody"})
    public java.lang.String testController(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    blind.project.dto.TestRequestBodyDTO testRequestBodyDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/testResponseBody"})
    public blind.project.dto.ResponseDTO<java.lang.String> testControllerResponseBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/testResponseEntity"})
    public org.springframework.http.ResponseEntity<?> testControllerResponseEntity() {
        return null;
    }
}