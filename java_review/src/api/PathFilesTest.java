package api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PathFilesTest {
	
	
	public static void main(String[] args) throws IOException {

		// 폴더생성
		Path path = Paths.get("c:/Temp/doc2");
		if (Files.exists(path)) {
			Files.createDirectory(path);
		}

		// 파일정보 확인
		Path file = Paths.get("c:/Temp/output.txt");
		System.out.println("파일크기: " + Files.size(file));

		// 파일 삭제
		// Files.delete(file);
		
		// 폴더 목록
		System.out.println("============폴더목록");
		Path temp = Paths.get("c:/Temp");

		Files.walk(temp)
				// .filter(Files::isRegularFile)
				.forEach(System.out::println);

		
		// 파일생성
		Path newFile = Paths.get("c:/Temp", "path.txt");
		Files.write(newFile, Arrays.asList("Hello", "Java"));


		
		// 파일 읽기
		System.out.println("============파일내용");
		List<String> lines = Files.readAllLines(newFile);

		for (String line : lines) {
			System.out.println(line);
		}
		
		
		
		
		
		
	}
}