import java.util.*;

import Userdefineexcep.InvalidusernameEx;
public class Account {
	static String name = "bhavani";
	static String pas = "bhanu";
	Scanner sc = new Scanner(System.in);
	String uname = sc.nextLine();
	String upas = sc.nextLine();
	System.out.println("enter user name:");
	System.out.println("enter user password:");
	if (name == uname && pas == upas) {
		System.out.println("1.Withdraw 2.Deposit 3.showBalance 4.Exit");
	} else {
		throw new InvalidusernameEx();

	}
	}
}
