public class Trows {
		public void div(int a, int b) throws ArithmeticException{
				int t=a/b;
			     System.out.println(t);
			     System.out.println("hai hello");
			   }
			   public static void main(String args[]){
			      Trows ob = new Trows();
			      try{
			    	  ob.div(12, 0);
			        
			      }
			      catch(ArithmeticException e){
			         System.out.println(" divide number by zero exception occur");
			      }
			   }
			}



