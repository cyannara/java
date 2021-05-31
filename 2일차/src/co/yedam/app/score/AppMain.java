package co.yedam.app.score;
public class AppMain {
	public static void main(String[] args) {
		
		ScoreApp score = new ScoreApp();
		//성적입력
		score.input();
		
		//score.avg = 100;
		//score.setAvg(100);
		
		//결과출력
		System.out.println( 
				score.getSum() + " : " +
				score.getAvg() + " : " +
				score.getGrade()
				);
		System.out.println( 
		"합격여부:"
		+ (score.isPass()? "합격":"불합격" ));
	}

}
