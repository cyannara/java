package day01.c02데이터타입;

public class 타입변환 {  //class 명

	public static void main(String[] args) {

		int var1 = 10;
		int var3 = 3;
		double var2 = 15.5;
		
		int result = var1 + (int)var2;  //강제 type 변환
		System.out.println(result);
		
		double resultValue = var1 + var2;  //자동 형 변환
		System.out.println(resultValue);
		
		double resultDiv = var1 / var3;
		System.out.println(resultDiv);  //3.0
		
		double resultDiv2 = var1 / (double)var3;
		System.out.println(resultDiv2);  //3.333
		
		//소수점 둘째자리까지 표현
		System.out.println( (int)(resultDiv2*100)/100.0); 
		
	}

}
