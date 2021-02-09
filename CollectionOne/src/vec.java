import java.util.*;
public class vec {

		public static void main(String[] args) {
			Vector<String> a=new Vector();
			a.add("ramya");
			a.add("miracle");
			a.add("ece");
			System.out.println(a);
			Enumeration i=a.elements();
			while(i.hasMoreElements())
			{
				System.out.println(i.nextElement());
			}
			
			
		}
}
