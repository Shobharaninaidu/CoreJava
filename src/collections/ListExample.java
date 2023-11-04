package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "abc", "xyz", "pqr" };
		ArrayList<String> list1 = new ArrayList<String>();

		// adding data to the list
		list1.add("Akshay");
		list1.add("Priya");
		list1.add("Pankaj");
		System.out.println(list1);

		// Access data at 3rd position

		System.out.println("The data at 3rd position is " + list1.get(2));

		// removing data from the list
		list1.remove(0);
		System.out.println(list1);
		System.out.println("The data at 1st position is " + list1.get(0));
		list1.add("Deepa");
		list1.add("Aparna");
		System.out.println(list1);

		// Print the last name in the ArrayList
		System.out.println("The last name is " + list1.get(list1.size() - 1));

		// change the value at 3rd position
		list1.set(2, "Savitha");
		System.out.println(list1);

		// Iterate thro' the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Value at index " + i + " " + list1.get(i));
			if (list1.get(i).equals("Savitha")) {
				System.out.println("Value Savitha is at index " + i);
			}
		}

		for (String name : list1) {
			System.out.println(name);
		}

		// sorting the data in ascending order
		Collections.sort(list1);
		System.out.println(list1);

		// sorting the data in descending order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);

	}

}
