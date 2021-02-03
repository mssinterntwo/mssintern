 public class Prime19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int num=10;
		    int count=0;
			System.out.println("Upto 10 prime numbers are: ");
			for(int i=1;i<=num;i++)
			{
				count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0)
					{
						count++;	        
					}
				}
				if(count==2) {
					System.out.println("prime number "+i);
			}
			
			       
		} 
	}
}

