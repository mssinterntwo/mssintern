package collectionframework;
import java.util.ArrayList;
import java.util.*;
public class addmethod {
	public static void main(String[] args)
	{
		ArrayList example=new ArrayList();
		example.add("vennela");
		example.add("dasari");
		example.add("divya");
		example.add("ruchitha");
		example.add(1);
		ListIterator i=example.listIterator();
		while(i.hasNext())
		{
		 System.out.println(i.next());
		
	     }
		

}
}
