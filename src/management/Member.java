package management;

public class Member {
    String name;
    String role;
    boolean isFlag= false;

    Member(String name, String role) {
        this.name = name;
        this.role = role;
    }
    String getName() {
        return this.name;
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
}
