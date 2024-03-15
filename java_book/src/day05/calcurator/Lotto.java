package co.micol.calcurator;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int[] num = new int[6];
	
	private void random() {  //한게임 만들기
		Random rand = new Random();
		for(int i = 0; i<6 ; i++) {
			num[i] = rand.nextInt(45)+1;  // 1 ~ 45 무작위 수
			//중복된수 인지 아닌지 판단 해야 한다.
			if(i != 0) {
				for(int j = i - 1; j >= 0; j--) {				
					if(num[i] == num[j]) {
						i--;
						break;  //for loop 탈출
					}
				}
			}
		}
	}
	
	public void run() {
		random();
		Arrays.sort(num);  //배열값을 오름차순으로 정렬한다.
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
