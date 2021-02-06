import java.util.*;

class InvalidusernameException{
	public static void main(String args[]) {
		Userdefineexcep u = new Userdefineexcep();
		try {
			u.Account();
		}
		catch (InvalidusernameEx e) {
			System.out.println(e);
		}
	}
}

public class Userdefineexcep {
	static String name = "bhavani";
	static String pas = "bhanu";
	int count = 0;

	void Account() throws InvalidusernameEx {
		Scanner sc = new Scanner(System.in);
		String uname = sc.nextLine();
		String upas = sc.nextLine();
		System.out.println("Enter user name:");
		System.out.println("Enter user password:");
		if (name == uname && pas == upas) {
			System.out.println("1.Withdraw 2.Deposit 3.showBalance 4.Exit");
		} else {
			throw new InvalidusernameEx();

		}
	}

	class InvalidusernameEx extends Exception {

	}
}
