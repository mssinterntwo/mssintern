package files;
import java.io.*;
import java.util.Properties;  
public class Filedemo2 {
	
	public static void main(String[] args) throws IOException { 
		String sample="hello bhavani";
		 byte[] b=sample.getBytes();
			Properties p = new Properties();
	        FileOutputStream fos = new FileOutputStream("sample1.txt");
			fos.write(b);
			FileInputStream fis = new FileInputStream("sample1.txt");
			p.load(fis);
			
			System.out.println(p.getProperty("sample"));
	            
	}  



}