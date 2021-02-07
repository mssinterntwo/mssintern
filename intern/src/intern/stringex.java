package intern;

public class stringex{  
public static void main(String args[]){  
	   String str = "Geeks Gor Geeks"; 
	   
       // Get the index 
       int ind = 6; 
 
       // Get the character 
       char ch = 'v'; 
 
       // Print the original string 
       System.out.println("Original String = "
                          + str); 
 
       str = str.substring(0, ind) 
             + ch 
             + str.substring(ind + 1); 
 
       // Print the modified string 
       System.out.println("Modified String = "
                          + str); 
   } 

}  
