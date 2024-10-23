package homework.part01.연산자;

/**
 *  
 */
public class BooleanTest1 {
	public static void main(String[] args) {
		char gender;    // 성별(M/F)
		int birthYear;  // 출생년도
		int license;    // 보유 자격증 수
		boolean lang2;  // 제2외국어 구사여부
		
		//동아리 가입조건
		//성별이 남자이고 2000년 이후 출생이며 제2외국어를 할 수 있는지 검사
		gender = 'M';
		birthYear = 1995;
		license = 2;      
		lang2 = true;
		
		boolean clubYn = gender == 'M' && birthYear > 2000 && lang2; 
		System.out.println("동아리 가입조건: " + clubYn);
		
	}
}
