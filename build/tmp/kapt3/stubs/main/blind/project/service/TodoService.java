package blind.project.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0012R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lblind/project/service/TodoService;", "", "repository", "Lblind/project/respository/TodoRepository;", "(Lblind/project/respository/TodoRepository;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "create", "", "Lblind/project/entity/TodoEntity;", "entity", "retrieve", "userId", "", "testService", "validate", "", "project"})
@org.springframework.stereotype.Service()
public class TodoService {
    private final blind.project.respository.TodoRepository repository = null;
    private final org.slf4j.Logger logger = null;
    
    public TodoService(@org.jetbrains.annotations.NotNull()
    blind.project.respository.TodoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String testService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<blind.project.entity.TodoEntity> create(@org.jetbrains.annotations.NotNull()
    blind.project.entity.TodoEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<blind.project.entity.TodoEntity> retrieve(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    private void validate(blind.project.entity.TodoEntity entity) {
    }
}