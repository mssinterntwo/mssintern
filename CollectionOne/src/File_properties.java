import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

	public class File_properties
		{

		public static void main(String...args) throws IOException{
			Properties p=System.getProperties();
			System.getProperties().list(System.out);
		}
		}