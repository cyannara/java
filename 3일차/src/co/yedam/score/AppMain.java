package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {
		
		ScoreArrApp score = new ScoreArrApp();
		score.printH();
		System.out.printf("총점=%04d\n",score.total());  //4자리 0으로채움
		System.out.printf("평균=%-6.2f",score.avg());
	}
}
