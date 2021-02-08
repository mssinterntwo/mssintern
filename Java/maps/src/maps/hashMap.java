package maps;

import java.util.*;
public class hashMap {
	public static void main(String ags[]) {
		HashMap obj=new HashMap();
		obj.put(1,"heam");
		obj.put(2,"sri");
		obj.put(3, "honey");
		System.out.println(obj);
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
			
			
			
		}
}
}