package co.micol.classExam;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 9;   //전체 출력되는 한 행의 최대 길이
		int space = size / 2;   //첯 행의 중간값 위치
		int col = 1;          //출력할 * 수
		int row = space + 1;
		for(int i = 0; i < row; i++) {  //전체 출력되는 행만큼 반복
			for(int j = 0; j < space; j++) {  //공백출력
				System.out.print(" ");
			}
			for(int k = 0; k < col; k++) {  // * 출력
				System.out.print("*");
			}
			space--;  //공백길이 
			col += 2; // * 수
			System.out.println();  //행넘김
		}
	}

}
