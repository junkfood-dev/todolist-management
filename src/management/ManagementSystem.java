package management;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Management management = new Management();
        Member member = null;
        Todo todo = null;

        while (true) {
            System.out.println("1. 가족 구성원 추가");
            System.out.println("2. 가족 구성원 조회");
            System.out.println("3. 일정 추가");
            System.out.println("4. 일정 조회");
            System.out.println("5. 일정 완료");
            System.out.println("6. 일정 삭제");
            System.out.println("7. 프로그램 종료");
            System.out.println("8. 일정 제목 수정");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("새로운 가족 구성원 추가");
                    System.out.println("이름을 입력하세요");
                    String name = sc.next();

                    System.out.println("역할을 입력하세요");
                    String role = sc.next();

                    member = new Member(name, role);
                    System.out.println(name + " 추가 완료");
                    management.family.add(member);
                    break;

                case 2:
                    System.out.println("가족 구성원 목록 조회");
                    management.printFamily();
                    break;

                case 3:
                    System.out.println("지울사람 이름");
                    String removeName = sc.next();
                    management.removeFamily(removeName);
                    break;

                case 4:
                    System.out.println("새로운 일정 추가");
                    System.out.println("일정 이름을 입력하세요");
                    String title = sc.next();
                    System.out.println("일정 날짜를 입력하세요");
                    String date = sc.next();
                    System.out.println("일정 소유주(?)를 입력하세요");
                    String owner = sc.next();

                    todo = new Todo(title, date, owner, LocalDateTime.now());
                    System.out.println(title + " 추가 완료");
                    management.todoList.add(todo);
                    break;

                case 5:
                    System.out.println("일정 조회 기능");
                    System.out.println("1. 전체 일정 조회");
                    System.out.println("2. 개인 일정 조회");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:

                            if (management.todoList.isEmpty()) {
                                System.out.println("등록된 일정이 없습니다.");
                            } else {
                                management.printTodoList();
                            }
                            break;
                        case 2:
                            System.out.println("일정 조회할 사람을 입력");
                            owner = sc.next();
                            management.printTodo(owner); // owner?
                    }
                    break;

                case 6:
                    System.out.println("일정 완료표기할거 이름 적어");
                    String finishTitle = sc.next();
                    management.markTodoComplete(finishTitle);
                    break;

                case 7:
                    System.out.println("지울거 이름");
                    String removeTitle = sc.next();
                    management.removeTodo(removeTitle);
                    break;

                case 8:
                    System.out.println("변경할 일정 제목을 입력해주세요.");
                    String titleName = sc.nextLine();
                    System.out.println("바꾸실 제목명을 입력해주세요");
                    String changeName = sc.nextLine();
                    management.titleEdit(titleName, changeName);
                    break;

                case 0:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                    break;
            }
        }
    }
}