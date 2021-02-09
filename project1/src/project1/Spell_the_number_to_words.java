package project1;
import java.util.Scanner;
public class Spell_the_number_to_words {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter a number");
	int n=a.nextInt();
	String[] Spell_Word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
			int rev=0;

	while(n!=0)
	{
		rev=rev*10+(n%10);
	n=n/10;
	}
	while(rev!=0)
	{
	System.out.println(Spell_Word[rev%10]);
		rev=rev/10;
	
	}

}
	}

