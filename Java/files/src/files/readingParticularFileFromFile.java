package files;
import java.io.*;

public class readingParticularFileFromFile {
	public static void main(String args[]) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("demo.txt"));
			for(int i=0;i<1;i++) {
				br.readLine();
				
			}
			System.out.println(br.readLine());
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}