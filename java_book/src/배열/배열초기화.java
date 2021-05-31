package 배열;
/*

 */
import java.awt.Point;

public class 배열초기화 {
	public static void main(String[] args) {
		
		//1차원배열
		//정수형 배열
		
		int[] i1 = {10,20,30};
		
		//문자열 배열
		char[] c1 = {'a','b','c'};
		
		//문자열 배열
		String[] s1 = {"have a","nice","day"};
		
		//객체배열
		Point[] p1 = {new Point(10,20), new Point(1,4), new Point(3,4)  };
		
		//2차원배열
		//정수형 2차원 배열
		int[][] i2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 무명 배열
		Object o = new int[] {1,2,3,4,5};
		for(int i=0; i<((int[])o).length; i++) {
			System.out.println(((int[])o)[i]);;
		}
	}
}
