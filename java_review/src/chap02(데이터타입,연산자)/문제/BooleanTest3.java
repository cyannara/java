package chap02;

/**
 *  
 */
public class BooleanTest3 {
	public static void main(String[] args) {
		char gender;    // 성별(M/F)
		int birthYear;  // 출생년도
		int license;    // 보유 자격증 수
		boolean lang2;  // 제2외국어 구사여부
		
		gender = 'M';
		birthYear = 2001;
		license = 2; 
		lang2 = false;
		
		boolean companyYn = checkEnter(birthYear, license);				      
		System.out.println("입사조건: " + companyYn);
		
		gender = 'M';
		birthYear = 2000;
		license = 1; 
		lang2 = false;
		
		companyYn = checkEnter(birthYear, license);				      
		System.out.println("입사조건: " + companyYn);
	}
	
	//입사조건 
	// 1990년 이전 출생자는 자격증 3개이상 보유 
	// 1991~2000년 사이 출생자는 자격증을 2개 이상 보유
	public static boolean checkEnter(int birthYear, int license) {
		boolean companyYn = birthYear < 1990 && license >=3 ||  
	            birthYear >1990 && birthYear <= 2000 && license >= 2;
	    return companyYn;
	}
}
