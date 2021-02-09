import java.util.*;
public class Stack_queue {

	public static void main(String[] args) {
		{
		 Stack<String> st = new Stack<String>();
	      st.push("ramya");
	      st.push("bhavani");
	      st.push("binnu");
	      st.pop();
	      System.out.println("stack: " + st);
		}
	      
		{  
		 Queue<String> s = new LinkedList();
	      s.add("ramya");
	      s.add("bhavani");
	      s.add("binnu");
	      System.out.println("Queue: " +s);
	      
	      
	      
	}
	}
	
}
