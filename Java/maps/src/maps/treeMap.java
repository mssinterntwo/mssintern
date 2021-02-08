package maps;
import java.util.*;
public class treeMap {
	public static void main(String args[]) {
		TreeMap obj=new TreeMap();
		obj.put(2, "hema");
		obj.put(5,"sri");
		obj.put(3,"honey");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry j=(Map.Entry)i.next();
			System.out.println(j.getKey()+" "+j.getValue());
		}
		
	}
}