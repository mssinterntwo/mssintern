package maps;
import java.util.*;
public class Linkhashmap {
	public static void main(String args[]) {
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(1, "dhoni");
		obj.put(3, "suresh");
		obj.put(2,"yuvi");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry) i.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
