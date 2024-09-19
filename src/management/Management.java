package management;

import java.util.ArrayList;

public class Management {
    ArrayList<Member> family;
    ArrayList<Todo> todoList;

    void addMember() {

    }
    void addTodo() {

    }
    void markTodoComplete(String title) {
        boolean find = false;
        for (Todo todo : todoList) {
            if (todo.getTitle().equals(title)) {
                if (todo.getIsComplete()) {
                    System.out.println("해당일정은 완료되어있습니다.");
                } else {
                    todo.setIsComplete(true);
                    System.out.println("일정 완료 처리 되었습니다.");
                }
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("존재하지 않는 일정입니다.");
        }
    }
    void printTodoList() {

    }
    void removeTodo() {

    }
    void printFamily() {

    }
}
