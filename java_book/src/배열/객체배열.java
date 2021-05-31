package 배열;

public class 객체배열{
	public static void main(String[] args) {
	/*	Score[] arr = new Score[3];
		arr[0] = new Score("철수",100,50,30);
		arr[1] = new Score("영희",70,20,30);
		arr[2] = new Score("돌이",70,20,30);*/
		
		Score[] arr = {new Score("철수",100,50,30), 
						new Score("영희",70,20,30),
						new Score("돌이",70,20,30)};		
		
	/*	for(int i=0; i<arr.length;i++) {
			System.out.println (arr[i].name + ":" + arr[i].total);
		}*/
		
		for (Score score : arr) {
			System.out.println (score.name +":"+ score.total);
		}
		

	}
}
