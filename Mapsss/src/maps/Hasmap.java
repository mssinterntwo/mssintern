package maps;
import java.util.*;
public class Hasmap {
	public static void main(String ags[]) {
		HashMap obj=new HashMap();
		obj.put(1,"hi");
		obj.put(2,"hello");
		obj.put(3, "hm");
		System.out.println(obj);
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"  "+e.getValue());
}

}
}
