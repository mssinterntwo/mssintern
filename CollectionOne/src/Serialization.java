import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
	class SerialoneClass implements Serializable 
	{
		int id;
		String name;
		SerialoneClass (int id,String name)
		{
			this.id=id;
			this.name=name;
		}
	}
		
		public class Serialization
		{
			public static void main(String args[]) throws Exception
			{
				FileOutputStream fo=new FileOutputStream("ramya.txt");
				SerialoneClass Sample1=new SerialoneClass(1,"miracle");
				SerialoneClass Sample2=new SerialoneClass(2,"software");
				SerialoneClass Sample3=new SerialoneClass(3,"systems");
				
				ArrayList al=new ArrayList();
				al.add(Sample1);
				al.add(Sample2);
				al.add(Sample3);
				ObjectOutputStream s1=new ObjectOutputStream(fo);
				s1.writeObject(al);
			}
			
		}
