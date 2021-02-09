import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class Sets {

	public static void main(String[] args) {
			HashSet<String> a=new HashSet<String>();
		     a.add("APPLE");
			a.add("ORANGE");
			a.add("MANGO");
			System.out.println(a);

			TreeSet<String> b=new TreeSet<String>();
		     b.add("RAMYA");
			b.add("INDHU");
			b.add("PAVANI");
			System.out.println(b);
			
			LinkedHashSet<String> c=new LinkedHashSet<String>();
		     c.add("CAR");
			c.add("BUS");
			c.add("TRAIN");
			System.out.println(c);
			}

}
