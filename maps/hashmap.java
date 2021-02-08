package maps;
import java.util.*;
public class hashmap {
	public static void main(String ags[]) {
		HashMap obj=new HashMap();
		obj.put(1,"pandu");
		obj.put(2,"sai");
		obj.put(3, "krishna");
		System.out.println(obj);
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
			
			
			
		}
	/* for(Map.Entry m:obj.entrySet()) { 
		 System.out.println(m.getKey());
		 System.out.println(m.getValue()); }
		 
*/
}
}