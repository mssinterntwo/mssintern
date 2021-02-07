package arraylist;
import java.util.*;
public class ArrayOnlynm {
	public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			ArrayList<String> al=new ArrayList();
			
			al.add("ganesh");
			al.add("dinesh");
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

		}

	}


