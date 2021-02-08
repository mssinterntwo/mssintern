package maps;
import java.util.*;
public class Hashmap {
	public static void main(String ags[]) {
		HashMap obj=new HashMap();
		obj.put(1,"Rajesh");
		obj.put(2,"Ramesh");
		obj.put(3, "Rakesh");
		System.out.println(obj);
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
			
			
			
		}
}
}