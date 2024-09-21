package management;

import java.util.ArrayList;

public class Management {
    ArrayList<Member> family;
    ArrayList<Todo> todoList;

    Management() {
        todoList = new ArrayList<>();
        family = new ArrayList<>();
    }

    void addMember(Member member) {
        this.family.add(member);
    }

    void addTodo(Todo todo) {
        this.todoList.add(todo);
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

    // 모든 일정 확인
    void printTodoList() {
        for (Todo todo : todoList) {
            System.out.println(todo.getOwner());
            System.out.println(todo.getDate());
            System.out.println(todo.getIsComplete());
        }
    }

    // 개인 일정 확인
    void printTodo(String owner) {
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

    void removeTodo(String title) {
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
        if (!family.isEmpty()) {
            for (Member member : family) {
                System.out.println("이름 : " + member.getName() + " 역할 : " + member.getRole());
            }
        } else {
            System.out.println("추가된 가족 구성원이 없습니다.");
        }
    }
}