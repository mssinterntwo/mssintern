import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class SerialClass implements Serializable 
	{
		int id;
		String name;
	}

public class DeserialExample {
   public static void main(String args[]) throws Exception
   {

		FileInputStream fi=new FileInputStream("ramya.txt");
		ObjectInputStream d=new ObjectInputStream(fi);
		ArrayList al=new ArrayList();
		al=(ArrayList)d.readObject();
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			SerialClass m=(SerialClass) i.next();
			System.out.print("\n"+m.id+" "+m.name+"\n");
		}
		
		
   }
}
