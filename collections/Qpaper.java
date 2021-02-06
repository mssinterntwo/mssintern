import java.util.*;
import java.util.Map.Entry;
public class Qpaper {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int count=0;
		  Map<String,Integer> qpap = new HashMap();
		  Map<Integer,String> g=new HashMap();
		  	qpap.put("how dog barks? 1.meow 2.bow bow",2);
		  	qpap.put("where is mss? 1.Mcity 2.bgpm",1);
		  	qpap.put("where is miracle clg? 1.bgpm 2.munjeru",2);

	    for (Map.Entry i : qpap.entrySet()) {
	      System.out.println(i + " value: " + qpap.get(i));
	      System.out.println("Enter your option");
	      int ans=sc.nextInt();
	      int j=(int) i.getValue();
	      if(ans==j)
	      {
	    	count++;  
	      }
	    }
	    System.out.println("You got "+count+" Out of 3 marks");
	  }
	}

