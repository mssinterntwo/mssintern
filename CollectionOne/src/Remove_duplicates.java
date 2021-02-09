import java.util.*;
public class Remove_duplicates {

	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,71,4,3,6,7));
	   System.out.println(number);
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(number);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println(listWithoutDuplicates);
	}

}
