import java.util.Scanner;
public class Stpalin {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	   	System.out.println("Enter string:");
	   	String str=s.nextLine();
	    int i=0,count=0; 
	    int j=str.length()-1;
	    while(i<j)
	        {
	    	if(str.charAt(i)!=str.charAt(j)) {
	    		count=1;
	    	}
	    	i++;
    		j--;
	        }
	   if(count==1) {
	    	System.out.println("not a palindrome");
	    }
	   else {
	    	 System.out.println("palindrome");
	    }
	  }   
	}

