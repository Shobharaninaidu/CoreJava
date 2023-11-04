package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
		System.out.println(map1);

		// update value of existing item
		map1.put("Item3", 300);
		System.out.println(map1);

		// find the price of item4 from map

		System.out.println("Price of Item4 is " + map1.get("Item4"));

		// remove item3 from map
		map1.remove("Item2");
		System.out.println(map1);

		// iterate through map
		for (int value : map1.values()) {
			System.out.println("Value is " + value);
		}

		for (String key : map1.keySet()) {
			System.out.println("The key is " + key);
			System.out.println("The value is " + map1.get(key));
		}

		// problem
		String st1 = "clean world green world happy world";

		// find no. of words
		// find occurrence of each word in the string using hashmap
		// clean 1
		// green 1
		// happy 1
		// world 3

	}

}
