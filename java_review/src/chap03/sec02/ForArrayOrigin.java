package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//평균을 계산하고 평균 미달 성적만 출력
// 총점계산  -> 평균계산 -> 평균미달성적출력
public class ForArrayOrigin {
	public static void main(String[] args) throws FileNotFoundException {
		
		// 파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);

		int score;
		int total = 0;
		
		int cnt = sc.nextInt();
		int[] a = new int[cnt];  //  ArrayList .size()
		
		//합계계산
		total = calcTotal(a, sc);
		System.out.println("total="+total);
		
		int lowAvg=0;
		//평균
		double avg = total/cnt;
		
		// 배열 출력
		print(avg, a);
		
		//전체 건수랑 평균미달 건수 
	}
	
	public static void print(double avg, int[] a) {
		for(int i=0; i<a.length; i++) {
			//평균보다 작은 성적만
			if( avg > a[i]) {				
				System.out.println(a[i]);
			}
		}
	}
	
	public static int  calcTotal(int a[], Scanner sc) {
		int total = 0;
		for(int i=0; i<a.length; i++) {
			int score = sc.nextInt();
			//입력값을 배열에 저장
			a[i] = score;
			total += score;
		}
		return total;
	}
}
