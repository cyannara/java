package day07.상속1;

public class Point3 extends Point2 {
	private int z;
	//생성자 (x,y,z)
	public Point3(int x, int y, int z) {
		//부모클래스의 생성자 호출
		super(x, y);  // 생략하면 부모의 디폴드 생성자를 호출
		this.z = z;
	}
	public void setZ(int z) {this.z = z;}
	public int getZ() {	return z;	}

	public boolean equals(Object temp) {
		Point3 p = (Point3)temp;
		return this.getX() == p.getX() && 
			   this.getY() == p.getY() &&
			   this.z == p.z;
	}
/*	public String toString() {
		return  getX() + ":" + 
				getY() + ":" + z; 
	}*/
}
