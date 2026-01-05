package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreClass {

	//필드 
	int cnt;
	int[] a;
	Scanner sc;
	
	public ScoreClass() {
		File file = new File("src/resources/engScore.txt");
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		cnt  = sc.nextInt();
		a = new int[cnt];
	}		
	//입력
	public void input() {
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
	}	
	//전체출력
	public void printAll() {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
