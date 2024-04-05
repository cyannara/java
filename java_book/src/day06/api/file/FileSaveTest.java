package day06.api.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileSaveTest {
	public static void main(String[] args) {
		//byte:stream , char(2~3):reader
		try {
			BufferedReader isr = new BufferedReader(
					               new InputStreamReader(System.in));
			BufferedWriter br = new BufferedWriter(
					               new FileWriter("d:/temp/f.dat"));
			while(true) {
				String c = isr.readLine();
				if(c == null ) break;
				br.write(c);
				br.write("\n");
			}
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
