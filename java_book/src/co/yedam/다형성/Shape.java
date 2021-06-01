package co.yedam.다형성;

//super class : 공통된 특성만 추출해서(일반화) 필드와 메서드를 정의
public class Shape {
	String color;
	String width;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
}

interface drawable {
	void draw();
}
