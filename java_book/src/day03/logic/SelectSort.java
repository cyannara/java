package co.micol.logic;

import java.util.Arrays;

public class SelectSort {
	
	static int[] num = {1,5,7,2,10,4,6,8,3,9}; //배열생성과 초기화
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		   
//		arrayTest();  //arrayTest 메소드를 호출한다.
		Arrays.sort(num);  //sort API
		for(int n : num) {   //결과 출력
			System.out.print(n + " ");
		}
		selectionSort();  //호출
//		System.out.println("=======================");
//		selectionSortPlus();
	}
	
	public static void arrayTest() {    //메소드 만들기
		for(int i = 0; i < num.length; i++) {
			System.out.println(i + " 요소값 : " + num[i]);
		}
	}
	
	public static void selectionSort() {  //전통적인 방법(현재는 이렇게 사용하지 않음)
		int temp;
		for(int i = 0; i < num.length - 1; i++) {  //sort start
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {   //두수 비교  asc >; desc <;
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}   //sort end
		
		for(int n : num) {   //결과 출력
			System.out.print(n + " ");
		}
	}
	
	public static void selectionSortPlus() {
		int temp, min;  //사용할 변수 선언
		for(int i = 0; i < num.length - 1; i ++) {  //start
			min = i;
			for(int j = i + 1; j < num.length; j ++) {  //최소 값 위치 찾기
				if(num[min] > num[j]) min = j;
			}  //최소값 위치 찾기 끝
			if(i != min) {   //현재 자리보다 작은값의 위치가 존재한다면 
				temp = num[i];
				num[i] = num[min];
				num[min] = temp;
			}			
		}  //sort end
		
		for(int n : num) {   //결과 출력
			System.out.print(n + " ");
		}
	}

}
