import java.util.*;
public class ListExample3{
	public static void main(String[] args){
		List<String> s = new ArrayList<String>();
		s.add("Arif");
		s.add("Rakib");
		s.add("Mamun");
		s.add("Jafar");
		s.add("Jafar");//Duplicate will print.
		Collections.reverse(s);
		System.out.println(s);
	}
}