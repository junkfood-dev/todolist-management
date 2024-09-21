package management;

import java.util.ArrayList;

public class Management {
    ArrayList<Member> family;
    ArrayList<Todo> todoList;

    Management() {
        todoList = new ArrayList<>();
    }

    void addMember() {

    }
    void addTodo(Todo todo) {
        this.todoList.add(todo);
    }
    void markTodoComplete() {

    }
    void printTodoList() {

    }
    void removeTodo() {

    }
    void printFamily() {

    }
}
