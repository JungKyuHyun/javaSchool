import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {
	
	public static void main(String[] args) {
		Path workingDirectory=Paths.get(".").toAbsolutePath();
		
		System.out.println(workingDirectory);
	}

}
