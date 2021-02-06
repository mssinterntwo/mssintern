import java.util.*;
	public class Doarraylist {
		public static void main(String args[]) {
			ArrayList li = new ArrayList();
			li.add("hai");
			li.add("bhavani");
			li.add(113);
			li.add('D');
		Iterator it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
	}


