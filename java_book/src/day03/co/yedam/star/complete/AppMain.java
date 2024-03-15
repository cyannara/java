package day03.co.yedam.star.complete;

public class AppMain {

	public static void main(String[] args) {
		StarApp star = new StarApp();
//		star.drawUp();
//		star.drawUp(10);
		star.drawUp(10,'$');
		
		System.out.println("============================================");
		System.out.println("삼각형");
		System.out.println("============================================");
		star.draw(10,'@');
		
		System.out.println(star.pad('=', 100));
		System.out.println("삼각형 오른쪽");	
		System.out.println(star.pad('=', 100));
		star.drawRight(10,'@');
		
		star.drawTitle("역삼각형 왼쪽",100);
		star.drawInvert(10,'#');
		
		star.drawTitle("역삼각형 오른쪽",100);
		star.drawInvertRight(10,'#');
		
		star.drawTitle("나무",100);
		star.drawEq(4);
		star.drawEq(2,6);
		star.drawEq(4,8);
		star.drawRect(4);
	}
}
