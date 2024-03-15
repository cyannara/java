package co.micol.logic;

public class ForReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();  //행넘김
		}
		System.out.println("====================");
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();  //행넘김
		}
		
		System.out.println("====================");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {  
				System.out.print("*");  
			}
			System.out.println();  //행넘김
		}

	}

}
