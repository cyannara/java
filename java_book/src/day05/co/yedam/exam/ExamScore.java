package day05.co.yedam.exam;

public class ExamScore {
	String examNum;	//수험번호
	int kor;		//국어성적
	int his;		//역사성적
	int eng;		//영어성적
	int avg;		//평균
	
	// 수험번호, 국어, 역사, 영어 성적을 초기화하는 생성자
	// 3과목의 평균을 avg에 저장
	public ExamScore(String examNum, int kor, int his, int eng) {
		super();
		this.examNum = examNum;
		this.kor = kor;
		this.his = his;
		this.eng = eng;
	}
	
	//과락여부 확인
	boolean isPass() {
		if ( this.avg > 60 && kor>=40 && his>=40 && eng >=40) {
			return true;
		} else {
			return false;
		}
	}


}
