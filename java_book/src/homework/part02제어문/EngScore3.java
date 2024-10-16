package homework.part02제어문;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class EngScore3 {
	
	List<Integer> engScore;
	
	public static void main(String[] args) throws Exception {
		EngScore3 empMng = new EngScore3();
		empMng.input();
	}
	
	public void input() throws Exception {
		Scanner sc;
		File file = new File("src/resources/engScore.txt");
		sc = new Scanner(file);
		sc.useDelimiter(",");
		int score;
		while(sc.hasNext()) {
			score = sc.nextInt();
			System.out.println(score);
		}
		sc.close();
	}
	public void list() {
		for(int score : engScore) {
			System.out.println(score);
		}
	}
}
