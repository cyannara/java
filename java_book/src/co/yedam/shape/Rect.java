package co.yedam.shape;

public class Rect
       extends Shape                //속성, 메서드
       implements Drawable, Movable //추상메서드   
       {
	
	@Override
	public void draw(){  
		System.out.println("사각형 그리기");
	}
	@Override
	public void move() {
		System.out.println("사각형 이동");
		
	}
}
