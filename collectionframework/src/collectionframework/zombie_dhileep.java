package collectionframework;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class zombie_dhileep {
	public static void main(String[] args)
	{    
		int count=0,add=0; 
		Scanner sc=new Scanner(System.in);
		String s1[]={"A.fruit","B.vegetable","C.seed","D.None of the above","A.bat","B.ball","C.wicket","D.cock","A.monocot","B.dicot","C.None of the above","D.All of the above","A.fungi","B.bacteria","C.plant","D.None of the above","A.crow","B.parrot","C.pigeon","D.dog"};
		char first='A';
		char second='D';
		char third='A';
		char fourth='A';
		char fifth='D';
		int i, j;
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
	     hash.put(1,".  Tomato is a:");
		 hash.put(2,".  choose the odd one:");
		 hash.put(3,".  paddy belongs to which type of seed?");
		 hash.put(4,".  mushroom is a type of?");
		 hash.put(5,".  choose the odd one:");
		 for(Map.Entry<Integer, String> m1:hash.entrySet())
		 {
			 System.out.println(m1.getKey()+""+m1.getValue());
			 add=add+1;
			 if(add==1)
			 {
				for( i=0;i<4;i++)
				{
					System.out.println(s1[i]);
				}
				System.out.println("Enter your answer:");
				char a=sc.next().charAt(0);
				if(a==first)
				{
					count=count+1;
				}
			 }
			 if(add==2)
			 {
				 for(i=4;i<=7;i++)
				 {
					 System.out.println(s1[i]);
				 }
				 System.out.println("enter your answer:");
				 char b=sc.next().charAt(0);
				 if(b==second)
				 {
					 count=count+1;
				 }
			 }
			 if(add==3)
			 {
				 for(i=8;i<=11;i++)
				 {
					 System.out.println(s1[i]);
				 }
				 System.out.println("enter your answer:");
				 char c=sc.next().charAt(0);
				 if(c==third)
				 {
					 count=count+1;
					 
				 }
			 }
			 if(add==4)
			 {
				 for(i=12;i<=15;i++)
				 {
					 System.out.println(s1[i]);
				 }
				 System.out.println("Enter your answer:");
				 char d=sc.next().charAt(0);
				 if(d==fourth)
				 {
					 count=count+1;
				 }
			 }
			 if(add==5)
			 {
				 for(i=16;i<=19;i++)
				 {
					 System.out.println(s1[i]);
				 }
				 System.out.println("enter your answer:");
				 char e=sc.next().charAt(0);
				 if(e==fifth)
				 {
					 count=count+1;
				 }
				 
			 }
			 
			 
		 }
		 if(count>3)
		 {
			 System.out.println("congrats you got"+count+"marks");
		 }
		 else
		 {
			 System.out.println(" pakkaki velli aadukoo...........");
		 }
		 
		
		
			
		
	}   

}
