package day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriterTest {

	public static void main(String[] args) throws Exception{

		FileWriter fw = new FileWriter("d:/upload/data2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("good morning");
		bw.close();
		fw.close();
		
		FileReader fr = new FileReader("d:/upload/data2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String a = br.readLine();
		System.out.println(a);
		br.close();
		fr.close();
	}

}
