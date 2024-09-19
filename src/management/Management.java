package management;

import java.util.ArrayList;

public class Management {
    ArrayList<Member> family;
    ArrayList<Todo> todoList;

    void addMember() {

    }
    void addTodo() {

    }
    void markTodoComplete() {

    }
    void printTodoList() {

    }
    void removeTodo(Todo title) {
        boolean find = false;
        for (Todo todo : todoList) {
            if (todo.getTitle().equals(title)) {
                todoList.remove(todo);
                System.out.println("할일 " + todo + "를(을) list에서 삭제했습니다.");
                find = true;
            }
        }
        if (!find) {
            System.out.println("존재 하지 않는 " + title + "입니다.");
        }
    }
    void printFamily() {

    }
}
