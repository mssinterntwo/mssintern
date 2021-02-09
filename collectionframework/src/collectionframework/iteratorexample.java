package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
public class iteratorexample {
	public static void main(String[] args)
	{
		 ArrayList alist=new ArrayList();
		 alist.add(1);
		 alist.add("vennela");
		 alist.add("dasari");
		 alist.add(2);
		 alist.add("anupama.buridi");
		 alist.add("divya");
		 System.out.println("Array list elements are:");
		 for(int i=0;i<alist.size();i++)
		 {
			 System.out.println(alist.get(i));
		 }
		 Iterator i=alist.iterator();
	}

}
