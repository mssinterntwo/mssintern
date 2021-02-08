package maps;
import java.util.*;
public class Treemap {
	public static void main(String args[]) {
		TreeMap obj=new TreeMap();
		obj.put(2, "Rahul");
		obj.put(5,"Rohit");
		obj.put(3,"Buvi");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry j=(Map.Entry)i.next();
			System.out.println(j.getKey()+" "+j.getValue());
		}
		
	}
}
