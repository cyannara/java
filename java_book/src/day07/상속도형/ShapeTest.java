package day07.상속도형;

public class ShapeTest {

	public static void main(String[] args) {

		Shape s = new Rect(10,5);
		s.area();
		s.print();
		
		s = new Tri(10,5);
		s.area();
		s.print();
	}

}
