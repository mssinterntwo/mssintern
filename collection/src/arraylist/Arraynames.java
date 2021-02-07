package arraylist;

import java.util.*;
public class Arraynames {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 ArrayList<String> al=new ArrayList();
			
			al.add("ganesh");
			al.add("dinesh");
			al.add("mahesh");
			al.add("suresh");
			al.add("ganesh");
			for(String n: al)//enhanced for-loop
			{
				System.out.println(n);
			}
			
	}
	}
