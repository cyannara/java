package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int sum=0;
		
		while(true) {
			String a = br.readLine();
			//탈출조건
			if( a == null || a.isEmpty() ) break;
			//sum에 더하고
			sum += Integer.parseInt(a);
		}
		//합계 출력
		System.out.println(sum);
	}

}
