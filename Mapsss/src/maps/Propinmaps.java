package maps;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
public class Propinmaps {
	public static void main(String args[]) throws IOException {
		Properties obj=new Properties();
		obj.setProperty("1", "Rajesh");
		obj.setProperty("2","Mahesh");
		obj.setProperty("3","Suresh");
		FileOutputStream fo=new FileOutputStream("D:/java/propsex.properties");
		obj.store(fo, "stoing");
		obj.load(new FileInputStream("D:/java/propsex.properties"));
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		System.out.println();
		
	}
}
