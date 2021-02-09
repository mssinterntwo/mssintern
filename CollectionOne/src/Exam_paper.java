import java.util.HashMap;
import java.util.*;
public class Exam_paper {

	public static void main(String[] args) {
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("what is world most common religion ? \n 1.Hinduism 2.christianity 3.musilm",1);
		a.put("who was the world richest person ? \n 1.bill gates 2.elon mask 3.ambani",2);
		a.put("cheif minster of AP? \n 1.chandrababu 2.jagan 3.kcr",2);
		
		for(Map.Entry<String,Integer> m1: a.entrySet())
		{
		System.out.println(m1.getKey());
		System.out.println("input your answer");
		Scanner ans=new Scanner(System.in);

		int b=ans.nextInt();
		if(b==m1.getValue())
		{
		System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
}
