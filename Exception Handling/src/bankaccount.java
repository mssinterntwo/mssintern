
import java.util.Scanner;
class A extends Exception
{
A(){
System.out.println("exception raised:");
}
}
public class bankaccount {
       
int Withdraw(int w,int n,int c)
{
  if(c==1)
  {
try
  {
  if(n>=w)
  {
  System.out.println("amount withdrawn done:\nReamining bal"+(n-w));n=n-w;
 
  }
  else
  {
  throw new A();
  }
  }catch(A e) {
  System.out.println(e);
  }
  }
  if(c==2)
  {
  try
  {
  if(w>500)
  {
  System.out.println("deposited:\navalilable bal"+(n+w));n=n+w;
  }
  else
  {
  throw new A();
  }
  }catch(A e) {
  e.printStackTrace();
  }
  }
  if(c==3) {
  System.out.println("available "+n);
  }
  return n;
 
}

public static void main(String[] args) throws Exception
{    

   bankaccount can=new bankaccount();
Scanner sc=new Scanner(System.in);
String s1="vennela";
String s2="vennela@12345";
int n=10000;

System.out.println("enter your name:");
String usr=sc.nextLine();
System.out.println("enter your password:");
String pass=sc.nextLine();
        if(usr.equals(s1)&& pass.equals(s2))
        {
        while(true)
        {  
        System.out.println("enter your choice:");
        System.out.println("1.withdraw\n 2.deposit\n 3.showbal \n 4.exit");
        int c=sc.nextInt();
        switch(c)
        {
         case 1:
         System.out.println("enter amount to withdrawn:");
        int w=sc.nextInt();
           n= can.Withdraw(w,n,c);
                break;
         case 2: //can.deposit();
          System.out.println("enter amount to deposit:");
        int w1=sc.nextInt();
             n= can.Withdraw(w1,n,c);
                 break;
         case 3://System.out.println(n);
           can.Withdraw(0, n, c);
           break;
         case 4:System.out.println("thanks.......");
                   System.exit(0);  
        deafault:System.out.println("enyter correct one:");
                  break;
           }
        }
       
        }
        else {
       
        System.out.println("you have entered incorrect one");
        System.exit(1);
}
}
}

