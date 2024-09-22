package management;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Management {
    ArrayList<Member> family;
    ArrayList<Todo> todoList;
    ArrayList<Member> historyMember;
    ArrayList<Todo> history;



    Management() {
        todoList = new ArrayList<>();
        family = new ArrayList<>();
        historyMember = new ArrayList<>();
        history = new ArrayList<>();

    }

    void addMember(Member member) {
        this.family.add(member);
    }

    void changedName(String name, String changedName) {
        boolean found = false;
        for (Member member : family) {
            if (member.getName().equals(name)) {
                historyMember.add(member);
                member.setName(changedName);
                member.setUpdatedAt(LocalDateTime.now());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("없는 가족");
        } else {
            System.out.println("이름이 " + name + "에서 " + changedName + "으로 변경됨");
        }
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
            if (!todo.getIsDelete()) {
                System.out.println(todo.getOwner());
                System.out.println(todo.getDate());
                System.out.println(todo.getIsComplete());
            }
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
                todo.setIsDelete(true);
                System.out.println("할일 " + title + "를(을) list에서 삭제했습니다.");
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("존재 하지 않는 " + title + "입니다.");
        }
    }

    void printFamily() {
        boolean visible = false;
        if (!family.isEmpty()) {
            for (Member member : family) {
                if (!member.getIsFlag()) {
                    System.out.println("이름 : " + member.getName() + " 역할 : " + member.getRole());
                    visible = true;
                }
            }
        }
        if (!visible) {
            System.out.println("추가된 가족 구성원이 없습니다.");
        }

    }

    void removeFamily(String name) {
        boolean isFlag = false;
        if (!family.isEmpty()) {
            for (Member member : family) {
                if (member.getName().equals(name)) {
                    member.setIsFlag(true);
                    isFlag = true;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(name + " 이 삭제되었습니다.");
            }
        } else {
            System.out.println("존재하지 않는 이름입니다.");
        }
    }

    void titleEdit(String title, String changeTitle) {
        boolean isFound = false;
        for (Todo todo : todoList) {
            if (todo.getTitle().equals(title)) {
                Todo copiedTodo = new Todo(todo);
                history.add(copiedTodo);
                todo.setTitle(changeTitle);
                todo.setUpdatedAt(LocalDateTime.now());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("찾는 일정의 제목이 없습니다.");
        }
    }
}