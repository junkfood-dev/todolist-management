package management;

import java.time.LocalDateTime;

public class Todo {
    String title;
    String date;
    String owner;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    boolean isComplete = false;
    boolean isDelete = false;

    Todo(String title, String date, String owner, LocalDateTime createdAt) {
        this.title = title;
        this.date = date;
        this.owner = owner;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public Todo(Todo todo){
        this.title = todo.title;
        this.date = todo.date;
        this.owner = todo.owner;
        this.updatedAt = todo.updatedAt;
    }

    void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    boolean getIsComplete() {
        return isComplete;
    }
    String getTitle() {
        return title;
    }
    String getDate() {
        return date;
    }
    String getOwner() {
        return owner;
    }
    public void setIsDelete(boolean delete) {
        this.isDelete = delete;
    }
    boolean getIsDelete() {
        return this.isDelete;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}