package co.yedam.상속2;

public class Circle extends Shape {


	public Circle(int w) {
		this.w = w;
	}
	
	public void area() {
		result = w * w * 3.14;
	}
}
