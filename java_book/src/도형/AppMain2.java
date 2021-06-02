package 도형;
public class AppMain2 {
	public static void main(String[] args) {
		Shape s = new Rect(4,5);   //부모타입 자식객체 참조가능. 자동형변환
		execute(s);
		
		Shape s2 = new Circle(4);
		execute(s2);
	}
	public static void execute(Shape s) {
		s.area();   	//다형성 : 참조대상의 메서드호출 -> 실행결과 다르게
		if (s instanceof Movable) {
			((Movable)s).move();   //강제형변환
		}
	}
}
