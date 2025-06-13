package chap02;

import java.util.Scanner;

/**
 *  
 */
public class BooleanTest1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int birthYear;  // 출생년도
		int license;    // 보유 자격증 수
		boolean lang2;  // 제2외국어 구사여부
		
		birthYear = scanner.nextInt();
		license = scanner.nextInt();
		lang2 = scanner.nextBoolean();
		
		//입사 조건
		//성별이 남자이고 2000년 이후 출생이며 보유 자격증은 2개이상 제2외국어를 할 수 있는지 검사
		boolean joinYn = birthYear >= 2000 && license >= 2 && lang2; 
		System.out.println("입사 조건: " + joinYn);
		
	}
}
