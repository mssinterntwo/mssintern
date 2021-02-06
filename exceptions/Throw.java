public class Throw {
	   public void checkAge(int age){
		      if(age<18)
		         throw new ArithmeticException("Not Eligible for voting");
		      else
		         System.out.println("Eligible for voting");
		   }
		   public static void main(String args[]){
		      Throw obj = new Throw();
		      obj.checkAge(12);
		   }
		}

