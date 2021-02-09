import java.io.*;
public class serialization_example {
	public static void main(String[] args)
	{
		try
		{
		    Employee emp=new Employee(521,"vennela");
		    FileOutputStream fout=new FileOutputStream("E:\\serial.txt");
		    ObjectOutputStream oos=new ObjectOutputStream(fout);
		    oos.writeObject(emp);
		    System.out.println("successfully wrote the data!!!!");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}



 
 class Employee implements Serializable{

	
		 int id;
		 String name;
	public	Employee(int id,String name) 
		 {
			this.id=id;
			this.name=name;
		 }
	 }
	
	