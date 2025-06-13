package chap03.제어문;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngScore4 {
	
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
		// BufferedWriter 생성
		file = new File("src/output/score.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
		//성적 출력
		for(int ele : scoreList) {
			bw.write("<div>" + ele + "</div>\n");
		}
		
		//합계출력
		bw.write("total="+total);
		bw.close();
	}
	
}
