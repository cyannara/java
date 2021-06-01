package base.trycatch;

public class X {

	public static void main(String[] args) {
		try {
			badMethod(); 					// 1. 메서드 호출
			System.out.println("A");
		} catch (RuntimeException ex) { 	// 3. catch 블록이 처리
			System.out.println("B"); 		// 4 "B" 출력
		} catch (Exception ex1) {
			System.out.println("C");
		} finally { 						// 5. finally 블록은 항상 실행
			System.out.println("D"); 		// 6. "D" 출력
		}
		System.out.println("E"); 			// 7. "E" 출력

	}

	public static void badMethod() {
		throw new RuntimeException(); 		// 2. 런타임오류 발생
	}
}
