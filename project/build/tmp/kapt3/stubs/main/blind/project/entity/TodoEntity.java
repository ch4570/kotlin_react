package blind.project.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lblind/project/entity/TodoEntity;", "", "id", "", "userId", "title", "done", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDone", "()Z", "setDone", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getUserId", "setUserId", "project"})
@javax.persistence.Table(name = "Todo")
@javax.persistence.Entity()
public class TodoEntity {
    @org.jetbrains.annotations.Nullable()
    @org.hibernate.annotations.GenericGenerator(name = "system-uuid", strategy = "uuid")
    @javax.persistence.GeneratedValue(generator = "system-uuid")
    @javax.persistence.Id()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private boolean done;
    
    public TodoEntity() {
        super();
    }
    
    public TodoEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String title, boolean done) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUserId() {
        return null;
    }
    
    public void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getTitle() {
        return null;
    }
    
    public void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public boolean getDone() {
        return false;
    }
    
    public void setDone(boolean p0) {
    }
}