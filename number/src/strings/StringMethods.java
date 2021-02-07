package strings;
import java.util.*;
public class StringMethods {
	public static void main(String[] args) {
	String s="Sachin";  
	System.out.println(s.toUpperCase());//SACHIN  
	System.out.println(s.toLowerCase());//sachin  
	System.out.println(s);//Sachin(no change in original)  
	String s1="   hello  ";
	System.out.println(s1);
	System.out.println(s1.trim());//trim method eliminates white spaces before and after string.
	
	System.out.println(s.startsWith("Sa"));//true  //if starts with s
	 System.out.println(s.endsWith("n"));//true
	 System.out.println(s.charAt(0));//S  
	 System.out.println(s.charAt(3));//h  
	 System.out.println(s.length());
	 String st5="Java is a programming language. Java is a platform. Java is an Island.";    
	 String replaceString=st5.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
	 System.out.println(replaceString);    
}
}