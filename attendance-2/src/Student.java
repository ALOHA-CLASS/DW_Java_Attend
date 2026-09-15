import java.time.LocalTime;

/*
 * Student: Person을 상속받고 Attendable 인터페이스를 구현하는 클래스 (2일차 - 상속/인터페이스)
 */
public class Student extends Person implements Attendable {
    private static final int LATE_LIMIT_HOUR = 9;
    private static final int LATE_LIMIT_MINUTE = 30;
    private static final int EARLY_LEAVE_HOUR = 17;
    private static final int EARLY_LEAVE_MINUTE = 30;

    private String status = "미출석";
    private String lastCheckTime; // 마지막으로 처리된 시각(HH:mm), 출결 이력 기록에 사용

    public Student(String name) {
        super(name); // 부모(Person) 생성자 호출
    }

    @Override
    public void checkIn() {
        // 시스템 현재 시각으로 출석/지각 판정

    }

    @Override
    public void checkOut() {
        // 시스템 현재 시각으로 조퇴/정상출석 판정 (다시 찍으면 최신 시각으로 갱신)

    }

    @Override
    public String getStatus() {
        return status;
    }

    public String getLastCheckTime() {
        return lastCheckTime;
    }

    // 퇴실(조퇴/정상출석) 상태 여부 - 출결 이력에서 기존 퇴실 기록을 찾을 때 사용
    public boolean isCheckOutStatus() {
        
    }
}
