import java.util.*;
public class Collection_interface {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		ArrayList<String> a2=new ArrayList();
		a2.add("d");
		a2.add("e");
		a2.add("f");
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.remove("b");
		System.out.println(a1);
		a1.retainAll(a2);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		a2.removeAll(a1);
		System.out.println(a2);
	}

}
