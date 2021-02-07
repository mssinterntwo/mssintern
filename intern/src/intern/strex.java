package intern;

import java.util.Locale;

public class strex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		      double piVal = Math.PI;

		      /* returns a formatted string using the specified format string,
		         and arguments */
		      System.out.format("%f\n", piVal);
		      
		      /* returns a formatted string using the specified locale, format
		         string and arguments */
		      System.out.format(Locale.US, "%10.2f", piVal);
		   }
	}


