package day01.입출력;

public class MemberInfoMain {
	public static void main(String[] args) {
		MemberInfo member = new MemberInfo();
		
		member.input();
		member.print();
		
		member.heightWeightInput();
		member.bmi();
		System.out.println(member.result +":" +member.s);
	}
}
