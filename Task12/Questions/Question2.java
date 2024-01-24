package Questions;

import java.util.ArrayList;


import java.util.List; 

public class Question2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); 
		list.add("Vicky");
		list.add("Virat");				
		list.add("Vijay");
		list.add("Dhoni");
		
		
		System.out.println("Before removing");

		System.out.println(list);
		
		list.clear();
		System.out.println("After removing");

		System.out.println(list);
	}

}
