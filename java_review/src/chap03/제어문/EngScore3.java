package chap03.제어문;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngScore3 {
	
	List<Integer> engScore = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		EngScore3 empMng = new EngScore3();
		empMng.input();
		empMng.list();
		System.out.println("total=" + empMng.total());
	}
	
	public void input() throws Exception {
		Scanner sc;
		File file = new File("src/resources/engScore.txt");
		sc = new Scanner(file);
		int score;
		while(sc.hasNext()) {
			score = sc.nextInt();
			if(score ==0) continue;
			engScore.add(score);
			System.out.println(score);
		}
		sc.close();
	}
	public void list() {
		for(int score : engScore) {
			System.out.println(score);
		}
	}
	
	public int total() {
		int total = 0;
		for(int score : engScore) {
			total += score;
		}
		return total;
	}
}
