package wrapper;

public class DoubleTest {

	public static void main(String[] args) {
		
		Double objD = 10.2;
		double d;
		
		//1
		d = objD;
		
		//2. double -> String
		String s = Double.toString(d) ;

		//3. String -> double
		d = Double.parseDouble(s);
		
	}
}
