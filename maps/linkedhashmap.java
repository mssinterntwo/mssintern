package maps;
import java.util.*;

public class linkedhashmap {
	public static void main(String args[]) {
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(1, "pandu");
		//obj.put(2, "sai");
		obj.put(3, "krishna");
		obj.put(2,"singireddi");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry) i.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}