package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HangleCheck {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("./src/day02/data.txt"));
		while (true) {
			String line = br.readLine();
			if (line == null)
				break; // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
			include(line);
		}
		br.close();
	}

	public static void include(String str) {
		boolean result = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '가' && str.charAt(i) < '나') {
				result = true;
				break;
			}
		}
		System.out.println(str + "\t" + result);

	}
}
