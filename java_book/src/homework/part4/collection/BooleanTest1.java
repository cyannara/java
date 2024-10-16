package homework.part4.collection;

/**
 *  
 */
public class BooleanTest1 {
	public static void main(String[] args) {

		Applicant applicant1 = new Applicant('M', 2001, 2, false);		
		boolean companyYn = checkEnter(applicant1);				      
		System.out.println("입사조건: " + companyYn);
		
		Applicant applicant2 = new Applicant('M', 2000, 1, false);		
		companyYn = checkEnter(applicant2);				      
		System.out.println("입사조건: " + companyYn);
	}
	
	//입사조건 
	// 1990년 이전 출생자는 자격증 3개이상 보유 
	// 1991~2000년 사이 출생자는 자격증을 2개 이상 보유
	public static boolean checkEnter(Applicant applicant) {
		boolean companyYn = applicant.birthYear < 1990 && applicant.license >=3 ||  
				applicant.birthYear >1990 && applicant.birthYear <= 2000 && applicant.license >= 2;
	    return companyYn;
	}
}
