package blind.project.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\'\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lblind/project/dto/TodoDTO;", "", "entity", "Lblind/project/entity/TodoEntity;", "(Lblind/project/entity/TodoEntity;)V", "id", "", "title", "done", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDone", "()Z", "setDone", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getTitle", "setTitle", "toEntity", "dto", "project"})
public final class TodoDTO {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private boolean done;
    
    public TodoDTO() {
        super();
    }
    
    public TodoDTO(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, boolean done) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getDone() {
        return false;
    }
    
    public final void setDone(boolean p0) {
    }
    
    public TodoDTO(@org.jetbrains.annotations.NotNull()
    blind.project.entity.TodoEntity entity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final blind.project.entity.TodoEntity toEntity(@org.jetbrains.annotations.NotNull()
    blind.project.dto.TodoDTO dto) {
        return null;
    }
}