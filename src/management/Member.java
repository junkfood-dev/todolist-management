package management;

public class Member {
    String name;
    String role;

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
}
