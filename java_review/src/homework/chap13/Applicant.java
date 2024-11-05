package homework.chap13;

public class Applicant {
	char gender;    // 성별(M/F)
	int birthYear;  // 출생년도
	int license;    // 보유 자격증 수
	boolean lang2;  // 제2외국어 구사여부
	
	public Applicant(char gender, int birthYear, int license, boolean lang2) {
		super();
		this.gender = gender;
		this.birthYear = birthYear;
		this.license = license;
		this.lang2 = lang2;
	}
	
	//입사조건 
	// 1990년 이전 출생자는 자격증 3개이상 보유 
	// 1991~2000년 사이 출생자는 자격증을 2개 이상 보유
	public boolean checkEnter() {
		boolean companyYn = this.birthYear < 1990 && this.license >=3 ||  
				this.birthYear >1990 && this.birthYear <= 2000 && this.license >= 2;
	    return companyYn;
	}
}
