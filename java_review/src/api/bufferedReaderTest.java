package api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("c:/Temp/file.txt"));
		br.lines().forEach(System.out::print);
		br.close();
	}
}
