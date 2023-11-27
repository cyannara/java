package 입출력;

import java.util.Scanner;

public class MemberInfo {
	String name;	//이름
	String id;		//주민번호
	String tel;		//전화번호

	double weight;  //몸무게
	double height;	//키
	
	double result = 0;  //bmi 결과
	String s = "";
	
	Scanner scanner = new Scanner(System.in);
	
	void heightWeightInput() {		
		// 코드 작성
		System.out.print("키(cm):");
		height = scanner.nextDouble();
		System.out.print("몸무게(kg):");
		weight = scanner.nextDouble();

	}
	
	String bmi() {

		result = weight / (height/100*height/100);

		//코드추가
//		# 산출된 값이 18.5 이하면 저체중, 
//		# 18.5~23은 정상, 
//		# 23~25는 과체중, 
//		# 25~30은 비만, 
//		# 30이상은 고도비만으로 나누어진다.
		
		
		return s;
	}
	
	void input() {
		// 코드 작성
		System.out.print("1. 이름:");
		name = scanner.next();
		System.out.print("2. 주민번호 앞 6자리:");
		id = scanner.next();
		System.out.print("3. 전화번호:");
		tel = scanner.next();
	}	
	
	void print() {
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}
}
