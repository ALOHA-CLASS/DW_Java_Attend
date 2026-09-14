import java.util.Scanner;

/*
 * [STEP 1] 기본 콘솔 출석 체크기 (1일차)
 * - 배열과 기본 자료형만으로 출석부를 관리합니다. (클래스/컬렉션은 2일차에서 도입)
 * - 사용 문법: 입출력(Scanner), 자료형, 조건문, 반복문, 메소드
 */
public class App {
    // 최대 학생 수
    // 학생 이름 배열
    // 출석 상태 배열
    // 현재 등록된 학생 수

    // 지각 기준 시간
    // 9시 10분까지는 지각, 그 이후는 출석 불가 안내
    // 17시(오후 5시) 30분 이전 하원은 조퇴 처리
    // 17시 30분 이전 하원은 조퇴 처리

    public static void main(String[] args) {
        // 출석 체크 시스템 초기화 및 메뉴 반복 시작
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu != 4) {
            // 메뉴 선택 전 출력 및 입력 처리


            sc.nextLine(); // nextInt() 뒤에 남아있는 개행 문자 제거

            // 메뉴 출력 및 입력 처리

        }
        sc.close();
    }

    static void printMenu() {
        System.out.println();
        System.out.println("===== 출석 체크 시스템 (1일차) =====");
        System.out.println("1. 출석 체크");
        System.out.println("2. 조퇴 체크");
        System.out.println("3. 전체 출석부 보기");
        System.out.println("4. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    // 시스템 현재 시각을 기준으로 출석/지각 여부를 판단하고 기록하는 메소드
    static void checkAttendance(Scanner sc) {
        // 출석 체크 전에 학생 수가 최대치를 초과했는지 확인

        // 학생 이름 입력 안내 메시지 출력

        // 현재 시각을 가져와 출석 상태를 판단하기 위한 준비

        // 출석 상태를 판단하여 status 변수에 저장

        // 출석부 배열에 학생 이름과 출석 상태를 기록하고 학생 수를 증가

        // 출석 체크 결과를 사용자에게 출력

    }

    // 시스템 현재 시각을 기준으로 조퇴 여부를 판단하고 기존 기록을 수정하는 메소드 (다시 찍으면 최신 시각으로 갱신)
    static void checkEarlyLeave(Scanner sc) {
        // 조퇴 체크를 위해 학생 이름을 입력받고 출석부에서 해당 학생을 찾음

        // 학생이 출석부에 없는 경우 처리

        // 현재 시각을 가져와 조퇴 상태를 판단하기 위한 준비

        // 조퇴 상태를 판단하여 출석부 배열을 갱신하고 결과를 출력

    }

    // 이름으로 학생을 찾아 배열 인덱스를 반환 (없으면 -1)
    static int findStudent(String name) {
        // 배열을 순회하며 이름이 일치하는 학생의 인덱스를 반환 (없으면 -1)

        // 이름이 일치하는 학생이 없는 경우 -1 반환

    }

    // 전체 출석부를 반복문으로 출력
    static void printAll() {
        // 전체 출석부를 반복문으로 출력하기 전에 학생 수가 0인지 확인

        // 학생 수가 0이면 "등록된 학생이 없습니다."를 출력하고 메소드 종료

        // 학생 수가 0이 아니면 출석부 배열을 순회하며 각 학생의 이름과 출석 상태를 출력
        
    }
}
