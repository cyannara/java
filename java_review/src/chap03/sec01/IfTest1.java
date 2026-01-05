package chap04.sec01;

/**
 * 휴일 체크
 * 월,수,금,일 근무일
 * 화,목,토는 휴일
 */
public class IfTest1 {

	public static void main(String[] args) {
		char week = '월';
		if(week == '월' || week =='수' || week == '금' || week == '일' ) {
			System.out.println(week + "요일은 근무일입니다.");
		} else {
			System.out.println(week + "요일은 휴일입니다.");
		}
	}
}
