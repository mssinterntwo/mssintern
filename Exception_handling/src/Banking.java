import java.util.Scanner;
import java.io.IOException;
public class Banking {
	int amount=10000;
	void deposit() {
		amount=amount+2000;
		System.out.println("despoit amount"+amount);
	}
	
	void show_balance() {
			System.out.println("amount"+amount);
		}
	
	void withdraw() {
		amount=amount-500;
		System.out.println("withdraw amount"+amount);
	}

	public static void main(String[] args) {
		System.out.println("1.deposit()\n2.show balance()\n3.withdraw()\n4.exit()");
		System.out.println("enter an option");
		Scanner bank=new Scanner(System.in);
		int ch=bank.nextInt();	
		Banking obj=new Banking();
		
		System.out.println("bank details");
		try
		{
				
				
				switch(ch)
				{
				case 1:
					obj.deposit();
					break;
				case 2:
					obj.show_balance();
					break;
				case 3:
					obj.withdraw();
					break;
				case 4:
					System.exit(0);
					break;
				default :System.out.println("invalid option");
		
				}
			
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
