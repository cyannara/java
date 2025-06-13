package chap04.sec01;

/**
 * 요일번호에 해당하는 요일명 출력 0 이면 일요일 1이면 월요일 ~ 6이면 토요일 출력
 */
public class IfTest2 {
	public static void main(String[] args) {
		int weekNo = (int) (Math.random() * 6);
		String weekName = "";
		if (weekNo == 0) {
			weekName = "일요일";
		} else if (weekNo == 1) {
			weekName = "월요일";
		} else if (weekNo == 1) {
			weekName = "화요일";
		} else if (weekNo == 1) {
			weekName = "수요일";
		} else if (weekNo == 1) {
			weekName = "목요일";
		} else if (weekNo == 1) {
			weekName = "금요일";
		} else if (weekNo == 1) {
			weekName = "토요일";
		}
		System.out.println(weekNo +" : " + weekName);
	}
}
