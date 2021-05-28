package co.yedam.star3;

public class AppMain {

	public static void main(String[] args) {
		StarApp star = new StarApp();
//		star.drawUp();
//		star.drawUp(10);
		star.drawUp(10,'$');
		
		System.out.println("============================================");
		System.out.println("»ï°¢Çü");
		System.out.println("============================================");
		star.draw(10,'@');
		
		System.out.println(star.pad('=', 100));
		System.out.println("»ï°¢Çü ¿À¸¥ÂÊ");	
		System.out.println(star.pad('=', 100));
		star.drawRight(10,'@');
		
		star.drawTitle("¿ª»ï°¢Çü ¿ÞÂÊ",100);
		star.drawInvert(10,'#');
		
		star.drawTitle("¿ª»ï°¢Çü ¿À¸¥ÂÊ",100);
		star.drawInvertRight(10,'#');
		
		star.drawTitle("³ª¹«",100);
		star.drawEq(4);
		star.drawEq(2,6);
		star.drawEq(4,8);
		star.drawRect(4);
	}
}
