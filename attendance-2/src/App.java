import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * [STEP 2] 객체 구조화 & 메모리 관리 (2일차)
 * - Person을 상속받는 Student, Attendable 인터페이스, Attendance 객체, ArrayList/Map을 도입해
 *   1일차의 배열 기반 코드를 객체지향 구조로 리팩터링합니다.
 */
public class App {
    // 배열에서 컬렉션으로 리팩토링

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu != 6) {
            printMenu();
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    registerStudent(sc);
                    break;
                case 2:
                    checkAttendance(sc);
                    break;
                case 3:
                    checkEarlyLeave(sc);
                    break;
                case 4:
                    printAllStatus();
                    break;
                case 5:
                    printHistory(sc);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
            }
        }
        sc.close();
    }

    static void printMenu() {
        System.out.println();
        System.out.println("===== 출석 체크 시스템 (2일차) =====");
        System.out.println("1. 학생 등록");
        System.out.println("2. 출석 체크");
        System.out.println("3. 조퇴 체크");
        System.out.println("4. 전체 출석 현황 보기");
        System.out.println("5. 학생별 출결 이력 보기");
        System.out.println("6. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    /**
     * 학생을 등록하고 출석 이력을 위한 초기 설정을 수행합니다.
     * @param sc
     */
    static void registerStudent(Scanner sc) {
       
    }

    /**
     * 출석 체크를 수행하고 출석 이력을 기록합니다.
     * @param sc
     */
    static void checkAttendance(Scanner sc) {

    }

    /**
     * 조퇴 체크를 수행하고 출석 이력을 갱신합니다.
     * @param sc
     */
    static void checkEarlyLeave(Scanner sc) {

    }

    /**
     * 학생 명부에서 이름으로 학생 객체를 찾습니다. 등록되지 않은 학생일 경우 null을 반환합니다.
     * @param sc 스캐너 객체
     * @return 학생 객체 또는 null
     */
    static Student findStudent(Scanner sc) {

    }

    /**
     * 학생의 출석 이력을 추가합니다.
     * 출석 이력을 Attendance 객체로 만들어 Map에 저장 (출석은 매번 새 기록으로 추가)
     * @param student
     */
    static void addHistory(Student student) {
        Attendance record = new Attendance(student.getName(), student.getStatus(), student.getLastCheckTime());
        historyMap.get(student.getName()).add(record);
    }

    /**
     * 조퇴 체크 시 사용됩니다.
     * 퇴실 기록이 이미 있으면 최신 시각으로 갱신(UPDATE), 없으면 새로 추가(INSERT)합니다.
     * @param student
     */
    static void upsertCheckOutHistory(Student student) {
        List<Attendance> history = historyMap.get(student.getName());
        for (Attendance record : history) {
            if (record.isCheckOut()) {
                record.update(student.getStatus(), student.getLastCheckTime());
                return;
            }
        }
        history.add(new Attendance(student.getName(), student.getStatus(), student.getLastCheckTime()));
    }

    /**
     * 전체 학생의 출석 현황을 출력합니다.
     */
    static void printAllStatus() {
        System.out.println();
        System.out.println("===== 전체 출석 현황 =====");
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getStatus());
        }
    }

    /**
     * 특정 학생의 출결 이력을 출력합니다.
     * @param sc 스캐너 객체
     */
    static void printHistory(Scanner sc) {
        Student student = findStudent(sc);
        if (student == null) return;

        System.out.println();
        System.out.println("===== " + student.getName() + "님의 출결 이력 =====");
        List<Attendance> history = historyMap.get(student.getName());
        if (history.isEmpty()) {
            System.out.println("출결 이력이 없습니다.");
            return;
        }
        for (Attendance record : history) {
            System.out.println(record);
        }
    }
}
