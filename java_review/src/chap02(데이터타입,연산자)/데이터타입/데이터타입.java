package method;

// boolean, char  int  long float double String
public class 데이터타입 {
	public static void main(String[] args) {
		// 빈 칸에 알맞은 데이터타입을 지정하세요.
		int score = 90; // 회사평가점수
		double rating = 4.5; // 회사 평점
		long profit = 2_200_000_000l; // 회사 순이익

		boolean mailYn = false;// 이메일 수신여부

		char grade = 'A';// 회사등급
		String name = "예담주식회사"; // 회사명

		System.out.println("score=" + score);
		System.out.println("rating=" + rating);
		System.out.println("profit=" + profit);
		System.out.println("mailYn=" + mailYn);
		System.out.println("grade=" + grade);
		System.out.println("name=" + name);

	}
}
