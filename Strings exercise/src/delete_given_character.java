import java.util.Scanner;
public class delete_given_character {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any string:");
	   String str=sc.next();
	   System.out.println("enter any character that you want to delete: ");
	   char c=sc.next().charAt(0);
	   
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)==c) {
			   String s=String.valueOf(c);
			  str= str.replace(s,"");
			   }
		   
	   }
	   System.out.println(str);
	   
	   
	   
   }
}
