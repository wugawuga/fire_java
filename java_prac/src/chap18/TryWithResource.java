package chap18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResource {

	public static void main(String[] args) {
		
		Path file = Paths.get(null);
		
		try(BufferedWriter writer = Files.newBufferedWriter(file)){
			writer.write('a');
			writer.write('z');
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	// 22-01-09 유캔뜌잇

}
