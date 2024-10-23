package homework.part4.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 */
public class BooleanTest2 {
	public static void main(String[] args) {
		
		List<Applicant> applicantList = new ArrayList<>();
		applicantList.add(new Applicant('M', 2001, 2, false));
		applicantList.add(new Applicant('M', 2000, 1, false));
		
		for(Applicant applicant : applicantList) {
			boolean companyYn = applicant.checkEnter();				      
			System.out.println("입사조건: " + companyYn);
		}
	}
	
}
