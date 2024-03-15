package day05.co.yedam.exam;

public class ExamApp {
	ExamScore[] scores;
	
	void init() {
		scores = new ExamScore[3];
		scores[0] = new ExamScore("A01", 100,80,70);
		scores[1] = new ExamScore("A02", 90,60,40);
		scores[2] = new ExamScore("A03", 50,60,40);
	}
	
	//합격자 출력
	void passList() {
		//과락(40점이하)이 없고 평균이 60점 이상
		int cnt = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i].isPass()) {
				System.out.println(scores[i]);
				cnt ++;
			} 
			System.out.println("합격자 수:" + cnt);
		}
	}
}
