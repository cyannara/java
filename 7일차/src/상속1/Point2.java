package 상속1;

public class Point2 {
	//필드
	protected int x;
	protected int y;
	//생성자
	public Point2() {
		System.out.println("Point2 default constructor");
	}
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2 paramter constructor");
	}
	
	//setter/getter
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}	
	//overriding(재정의 : 상속받은 메서드를 제정의)
	@Override
	public boolean equals(Object temp) {
		Point2 p = (Point2)temp;
		return this.x == p.x && this.y == p.y;
	}
/*	@Override
	public String toString() {
		return x + ":" + y; 
	}*/
	//일반메서드
	
}
