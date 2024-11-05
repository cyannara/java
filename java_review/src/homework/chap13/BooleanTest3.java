package homework.chap13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  
 */
public class BooleanTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<Applicant> applicantList = new ArrayList<>();
		Scanner sc;
		File file = new File("src/resources/applicant.txt");
		sc = new Scanner(file);
		String str;
		Applicant applicant;
		while(sc.hasNext()) {
			str = sc.nextLine();
			String[] arr = str.split(",");
			applicant = new Applicant(arr[0].charAt(0), 
					                  Integer.parseInt(arr[1]), 
					                  Integer.parseInt(arr[2]),
					                  Boolean.parseBoolean(arr[3]));
			applicantList.add(applicant);
		}
		sc.close();
		
		// 입사조건에 해당하는 지원자 이름과 지원자 수 출력
		for(Applicant app : applicantList) {
			boolean companyYn = app.checkEnter();				      
			System.out.println("입사조건: " + companyYn);
		}
	}
}
