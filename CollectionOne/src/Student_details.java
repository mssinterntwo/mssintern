import java.util.*;
public class Student_details {
	   int id;
		String name;
	Student_details(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

		public static void main(String[] args)
		{
			Student_details obj1=new Student_details(1,"ramya");
			Student_details obj2=new Student_details(2,"indhu");
			Student_details obj3=new Student_details(3,"pavani");
			ArrayList al=new ArrayList();
			al.add(obj1);
			al.add(obj2);
			al.add(obj3);
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				Student_details obj=(Student_details)i.next();
				System.out.println(obj.id+"  "+obj.name);
			}
			System.out.println(al);
			
			

	}

}
