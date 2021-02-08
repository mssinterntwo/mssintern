package files;
import java.util.*;
import java.io.*;
class A implements Serializable {
	int id;
	String name;
	A(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class Serilize_exmp {
	public static void main(String args[])throws IOException {
		int id;
		A a=new A(1,"ravali");
		A a1=new A(2,"ramya");
		A a2=new A(3,"bhavani");
		ArrayList li=new ArrayList();
		li.add(a);
		li.add(a1);
		li.add(a2);
		try {
			FileOutputStream fo = new FileOutputStream("java.txt");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(li);
			fo.close();
			System.out.println("completed");
		}
		catch(IOException e) {
			e.printStackTrace();
					
		}
	}

}
