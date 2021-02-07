package intern;

import java.util.Scanner;

class UserInvalid extends Exception{

	UserInvalid() {
		System.out.println("invalid");
	}
}

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="vyshu",name,password;
		String pwd="vyhsu123";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name and password to check your bank details");
		name=sc.nextLine();
		password=sc.nextLine();
		try
		{
		if(str.equals(name) && pwd.equals(password))
		{
			System.out.println(" you got chance bro!!!!!!!!");
		}
		else
		{
			System.out.println("ok");
			throw new UserInvalid();
		
		}
		}
		
		catch(UserInvalid s) 
		{
			System.out.println(" you got chance bro!!!!!!!!");
		}
		
	
	
}

}
