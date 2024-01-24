package Questions;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("Vicky");
		list.add("Virat");				
		list.add("Vijay");
		list.add("Dhoni");
		
		System.out.println("List is " + list);
		
		String[] array = list.toArray((new String[0]));
		System.out.println("After converting to array");
		for (String v:array) {
			System.out.println(v);
		}
		
		

	}

}
