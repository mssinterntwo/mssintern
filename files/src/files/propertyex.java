package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyex {
	public static void main(String[] args) throws IOException { 
	
			Properties p = new Properties();
	        FileOutputStream fos = new FileOutputStream("sample2.properties");
			p.setProperty("uname:","abc");
			p.setProperty("pwd:","def");
			p.store(fos);
			System.out.println(p.getProperty("sample"));
	            
	}  

}
