package api.wrapper;

public class FloatTest {
	public static void main(String[] args) {
		float f = 5.4f;
		String s;
		
		// float --> String
		s = Float.toString(f);
		
		//String --> flat
		f = Float.parseFloat(s);
	}
}
