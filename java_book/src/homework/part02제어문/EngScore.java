package homework.part02제어문;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngScore {
	
	public static void main(String[] args) throws Exception {
		List<Integer> scoreList = new ArrayList<>();
		//파일 입력
		Scanner sc;
		File file = new File("src/resources/engScore.txt");
		sc = new Scanner(file);
		sc.useDelimiter(",");
		int score;
		while(sc.hasNext()) {
			score = sc.nextInt();
			scoreList.add(score);
		}
		sc.close();
		
		//합계계산
		int total = 0;
		for(int ele : scoreList) {
			total += ele;
		}
		//성적 출력
		for(int ele : scoreList) {
			System.out.println(ele);
		}
		
		//합계출력
		System.out.println(total);
	}
	
}
