package maps;

import java.util.*;

public class linkedHashMap {
	public static void main(String args[]) {
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(1, "hema");
		obj.put(3, "sri");
		obj.put(2,"honey");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry) i.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}