package serialization;
import java.util.*;
import java.io.*;
class demo1 implements Serializable{
	int id;
	String s;
	demo1(int id,String s){
		this.id=id;
		this.s=s;	
	}
	
}
public class serializablearraylist {
	public static void main(String args[]) throws IOException {
		demo1 obj1=new demo1(100,"hema");
		demo1 obj2=new demo1(102,"sri");
		demo1 obj3=new demo1(103,"honey");
		ArrayList al=new ArrayList();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		FileOutputStream fi=new FileOutputStream("alobj.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fi);
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.writeObject(obj3);
		System.out.println("Serializtion is done");
	}

}