package work;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class W01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\user\\Desktop\\ABC.txt");
		try {
			byte[] byteArray = Files.readAllBytes(file.toPath());
			// byteArray는 이제 텍스트 파일의 바이트 코드를 담고 있습니다.
			// byteArray를 원하는 곳에 사용할 수 있습니다.
			// 예: byteArray를 다른 파일에 저장하거나, 네트워크로 전송하거나, 데이터베이스에 저장할 수 있습니다.
			for (byte b : byteArray) {
				System.out.println((int)b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
