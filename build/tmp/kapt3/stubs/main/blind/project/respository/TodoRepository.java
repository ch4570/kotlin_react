package blind.project.respository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lblind/project/respository/TodoRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lblind/project/entity/TodoEntity;", "", "findByUserId", "", "userId", "project"})
public abstract interface TodoRepository extends org.springframework.data.jpa.repository.JpaRepository<blind.project.entity.TodoEntity, java.lang.String> {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select t from TodoEntity t where t.userId = :userId")
    public abstract java.util.List<blind.project.entity.TodoEntity> findByUserId(@org.jetbrains.annotations.Nullable()
    @org.springframework.data.repository.query.Param(value = "userId")
    java.lang.String userId);
}