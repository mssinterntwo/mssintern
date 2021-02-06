import java.util.Scanner;
public class Prime39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int num=s.nextInt();
		int count=0;
			for(int j=1;j<=num;j++) {
					if(num%j==0)
					{
						count++;	        
					}
				}
				if(count==2) {
					System.out.println(num +" is a prime number ");
			}
				else {
					System.out.println(num+" is not a prime number ");
				}
			
			       
		} 
	}

