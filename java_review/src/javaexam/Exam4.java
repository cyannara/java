package javaexam;

public class Exam4 {
	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		obj1.displayC2();
		obj2.displayI();
	}
}

class C2 {
	public void displayC2() {
		System.out.print("C2");
	}
}

interface I {
	public void displayI();
}

class C1 extends C2 implements I {
	public void displayI() {
		System.out.print("C1");
	}
}
