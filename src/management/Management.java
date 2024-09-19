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
    // 모든 일정 확인
    void printTodoList() {
        for (Todo todo : todoList) {
            System.out.println(todo.getOwner());
            System.out.println(todo.getDate());
            System.out.println(todo.getIsComplete());
        }
    }
    // 개인 일정 확인
    void printTodo(Todo owner) {
        boolean find = false;
        for (Todo todo : todoList) {
            if (todo.getOwner().equals(owner)) {
                System.out.println(todo.getTitle());
                System.out.println(todo.getDate());
                System.out.println(todo.getIsComplete());
                find = true;
            }
        }
        if (!find) {
            System.out.println("존재 하지 않는 구성원 입니다.");
        }
    }
    void removeTodo() {

    }
    void printFamily() {

    }
}
