package management;

import java.time.LocalDateTime;

public class Member {
    String name;
    String role;
    boolean isFlag= false;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    Member(String name, String role) {
        this.name = name;
        this.role = role;
        this.createdAt = LocalDateTime.now();
    }
    String getName() {
        return this.name;
    }
    void setName(String changedName) {
        this.name = changedName;
    }
    String getRole() {
        return this.role;
    }
    boolean getIsFlag() {
        return isFlag;
    }
    void setIsFlag(boolean isFlag) {
        this.isFlag = isFlag;
    }
    LocalDateTime getCreatedAt() {
        return createdAt;
    }
    LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
