package 도형;

public class AppMain {

	public static void main(String[] args) {

		Drawable[] s = new Drawable[3];
		s[0] = new Rect(4,5);   //자식타입 부모타입으로 자동 형변환
		s[1] = new Circle(5);
		s[2] = new Tri(4,5);  
		
		for(Drawable temp : s ) {
			temp.draw();
			System.out.println(temp instanceof Rect );
			if( temp instanceof Rect ) {
				((Rect)temp).area();   //부모타입을 자식타입으로는 강제형변환
				((Rect)temp).print();
			} else if(temp instanceof Circle ) {
				((Circle)temp).area();
			} else if(temp instanceof Tri ) {
				((Tri)temp).area();
			}
			if ( temp instanceof Shape ) {
				((Shape)temp).area();
				((Shape)temp).print();
			}
			if( temp instanceof Movable) {
				((Movable)temp).move();
			}
		}
	}

}
