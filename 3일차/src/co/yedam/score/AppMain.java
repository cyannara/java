package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {
		//3. new 객체 생성
		ScoreArrApp score = new ScoreArrApp();
		//4. 객체 이용(메서드 호출)
		score.printH();
		System.out.printf("총점=%04d\n",score.total());  //4자리 0으로채움
		System.out.printf("평균=%-6.2f",score.avg());
	}
}
