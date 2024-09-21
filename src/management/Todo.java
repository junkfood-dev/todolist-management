package management;

public class Todo {
    String title;
    String date;
    String owner;
    boolean isComplete = false;

    Todo(String title, String date, String owner) {
        this.title = title;
        this.date = date;
        this.owner = owner;
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
}
