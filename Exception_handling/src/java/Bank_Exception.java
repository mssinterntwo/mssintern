package java;
	import java.util.Scanner;
	
	class Myexcep extends Exception {
	Myexcep(int i) {
	if (i == 1) {
	System.out.println("Enter valid amount!");
	} else if (i == 2) {
	System.out.println("Enter amount 500 or more !");
	}
	}
	}
	public class Bank_Exception extends Myexcep {
	Bank_Exception(int i) {
	super(i);
	}

	static Scanner sc = new Scanner(System.in);
	static int bal = 20000;
	static int pin = 1234;
	static int counter = 0;
	static boolean flag = true;

	public static void main(String[] args) throws Exception {
	int option, mypin;
	String name = "ramya";
	String myname;
	while (counter < 3) {
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter name : ");
	myname = sc.nextLine();
	System.out.printf("Enter pin : ");
	mypin = sc.nextInt();
	counter = counter + 1;
	if (name.equals(myname) && pin == mypin) {
	counter = 4;
	while (flag) {
	System.out.printf("Enter option : \n1.withdraw\n2.deposit\n3.show Balance\n4.Exit.");
	option = sc.nextInt();
	switch (option) {
	case 1:
	withdraw();
	break;
	case 2:
	deposit();
	break;
	case 3:
	showbal();
	break;
	case 4:
	myexit();
	break;
	default:
	System.out.println("Enter valid option");
	}
	}
	}
	if (counter == 3) {

	System.out.println("chances are over");
	}
	}
	}

	static int withdraw() {
	System.out.printf("Enter Amount to withdraw : ");
	int amount = sc.nextInt();
	try {
	if ((bal - amount) < 0) {

	throw new Myexcep(1);
	} else {
	bal = bal - amount;
	System.out.printf("Amount withdrawn.\nRemaining Amount : " + bal + "\n");
	}
	} catch (Myexcep e) {
	System.out.println("Insufficent Funds !!!");
	}

	return 0;
	}

	static void deposit() {
	System.out.println("deposit");
	System.out.printf("Enter Amount to deposit : ");
	int amount = sc.nextInt();
	try {
	if (amount < 500) {

	throw new Myexcep(2);
	} else {
	bal = bal + amount;
	System.out.println("Amount Deposited. Total amount available : " + bal + "\n");
	}
	} catch (Myexcep e) {
	System.out.println("Invalid Amount Entered");
	}
	}

	static void showbal() {
	System.out.print("Total balance available : " + bal + "\n");

	}

	static void myexit() {
	flag = false;
	System.out.println("Terminated!!");
	}

	}




