package homework.chap04.sec01;

/**
 * 요일번호에 해당하는 요일명 출력 0 이면 일요일 1이면 월요일 ~ 6이면 토요일 출력
 * 수요일과 토요일, 일요일이면 휴무일이라고 출력하고 아니면 근무일이라고 출력
 */
public class IfTest3 {
	public static void main(String[] args) {
		int weekNo = (int) (Math.random() * 6);
		String weekName = "";
		String workDay = "";
		if (weekNo == 0) {
			weekName = "일요일";
			workDay = "휴무일";
		} else if (weekNo == 1) {
			weekName = "월요일";
			workDay = "근무일";
		} else if (weekNo == 2) {
			weekName = "화요일";
			workDay = "근무일";
		} else if (weekNo == 3) {
			weekName = "수요일";
			workDay = "휴무일";
		} else if (weekNo == 4) {
			weekName = "목요일";
			workDay = "근무일";
		} else if (weekNo == 5) {
			weekName = "금요일";
			workDay = "근무일";
		} else if (weekNo == 6) {
			weekName = "토요일";
			workDay = "휴무일";
		}
		System.out.println(weekNo +" : " + weekName +" : " + workDay);
	}
}
