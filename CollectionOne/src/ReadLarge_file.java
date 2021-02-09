import java.io.FileReader;
import java.io.IOException;
	public class ReadLarge_file {
		public static void main(String...args) throws IOException{
			FileReader fr=new FileReader("read.txt");
			
			int i;
			do {
				i=fr.read();
				System.out.print((char)i);
			}while(i!=-1);
		}
	}
