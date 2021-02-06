import java.util.*;
class std{
	int i;
	String s;
	std(int i,String s){
		this.i=i;
		this.s=s;
	}
}
class Students {
	
	public static void main(String[] args) {
		std s1=new std(1," bhavani");
		std s2=new std(2," ashu");
		std s3=new std(3," ramya");
		ArrayList li=new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
	
		Iterator i= li.iterator();
		while(i.hasNext()) {
			std al=(std)i.next();
			System.out.println(al.i+""+al.s);
		}
	}

}
