import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChecker {
	public static void main(String[] args) throws IOException {
		Path fileName = Path.of("triangles.txt");
		String content = "hello world !!";
		Files.writeString(fileName, content);

		String actual = Files.readString(fileName);
		System.out.println(actual);
	}
}
