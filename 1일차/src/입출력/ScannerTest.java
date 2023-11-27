package 입출력;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        System.out.println("문자열, 정수, 소수점을 차레대로 입력하세요.");
   
         
        // 정수를 입력받고 출력합니다.
        int number = sc.nextInt();
        System.out.println("입력하신 정수는 [" + number + "] 입니다.");
       
         number = sc.nextInt();
        System.out.println("입력하신 정수는 [" + number + "] 입니다.");
        
        // 문자열을 입력받고 출력합니다.
        String str = sc.next();
        System.out.println("입력하신 값은 [" + str + "] 입니다.");
        
        // 정수를 입력받고 출력합니다.
        number = sc.nextInt();
        System.out.println("입력하신 정수는 [" + number + "] 입니다.");
    }
}
