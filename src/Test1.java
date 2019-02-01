import java.nio.file.Path;
import java.nio.file.Paths;

// 현재경로 추가하기

public class Test1 {
	public static void main(String[] args) {
		Path workingDirectory=Paths.get(".").toAbsolutePath();
		
		System.out.println(workingDirectory);
	}

	
}
