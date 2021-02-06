import java.util.*;  
public class Linkedlist{  
public static void main(String args[]){  
LinkedList al=new LinkedList();  
al.add("Raveti");  
al.add("Vijaya");  
al.add("Ramya");  
al.add("Ajit");  
Iterator it=al.iterator();  
while(it.hasNext()){  
System.out.println(it.next());  
}  
}  
}  
