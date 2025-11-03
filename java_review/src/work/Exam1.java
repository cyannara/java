package work;

public class Exam1 {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.name);
	}
}

class People {
	String name;
	String ssn;
	
	public People() {
		this.name ="무명";
	}
}

class Student extends People {
	int score;
}