import java.util.*;
public class Mapdemo2 {
	public static void main(String args[]) {
		HashMap<Integer, String> hmap = new <Integer,String> HashMap();
		hmap.put(1,"one");
		hmap.put(2,"two");
		hmap.put(3,"three");
		for(Map.Entry m : hmap.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
	}
}


