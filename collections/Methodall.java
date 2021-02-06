import java.util.ArrayList;
	public class Methodall {
		public static void main(String args[]) {
			ArrayList li = new ArrayList();
			li.add("hari");
			li.add("bhavani");
			li.add("ramya");
			li.add("Dhoni");
			System.out.println("arraylist:"+li);
			System.out.println("arraylist size:"+li.size());
			li.removeAll(li);
			System.out.println("arraylist:"+li);
			System.out.println("arraylist size:"+li.size());
			li.add("hari");
			li.add("bhavani");
			li.add("ramya");
			li.add("binita");
			li.addAll(li);
			System.out.println("arraylist:"+li);
			System.out.println("arraylist size:"+li.size());
			
		}
	}

