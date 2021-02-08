package serializationANDdeserialization;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
class demo implements Serializable{
	int id;
	String s;
	demo(int id,String s){
		this.id=id;
		this.s=s;
		
	}
	
}
public class serialization {
	public static void main(String args[]) throws IOException {
		demo obj=new demo(100,"pandu");
		demo obj2=new demo(101,"hema");
		demo obj3=new demo(103,"praveen");
		FileOutputStream fs=new FileOutputStream("serialize.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fs);
		oos.writeObject(obj);
		oos.writeObject(obj2);
		oos.writeObject(obj3);
		System.out.println("Serialization is done successfully");
		
	}
	

}
