/*
 * Attendance: 학생 한 명의 출결 기록 한 건을 표현하는 객체 (2일차 - 클래스/객체)
 */
public class Attendance {
    private String studentName;
    private String status;
    private String time;

    // 생성자 정의하기

    // 퇴실(조퇴/정상출석) 기록인지 여부
    public boolean isCheckOut() {

    }

    // 이미 있는 퇴실 기록을 최신 상태/시각으로 갱신 (UPDATE)
    public void update(String status, String time) {

    }

    @Override
    public String toString() {
        return time + " - " + studentName + " : " + status;
    }
}
