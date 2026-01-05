package method;

public class 문자열형변환 {
	public static void main(String[] args) {
		String str1 = "12.56";
		double d = Double.parseDouble(str1);

		String str2 = "3000";
		int i = str2;

		str1 = i;
		str1 = d;
	}
}
