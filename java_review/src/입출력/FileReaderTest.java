package 입출력;

import java.io.*;

/**
 * 문자 스트림을 파일 읽고 저장하기 
 *
 */
public class FileReaderTest {

	public static void main(String[] args) {
		
		//파일 문자 저장
		try {
			Writer fw = new FileWriter("d:/hyper.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("자바 연습");
			bw.newLine();
			bw.write("홍길동 안녕.");
			bw.newLine();
			bw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		//파일 문자 읽기
		try {
			//Reader fr = new FileReader("d:/hyper.txt");
			BufferedReader br = new BufferedReader(new FileReader("d:/hyper.txt"));
			String ch = br.readLine();
			System.out.println(ch);
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
