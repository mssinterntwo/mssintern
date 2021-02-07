package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistWithnmno
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        ArrayList l=new ArrayList();
		
		l.add("vyhu");
		l.add(5);
		l.add("dheeraj");
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
}
