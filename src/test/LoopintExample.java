package test;

public class LoopintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print all the numbers from 1 to 10
		// while loop
		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1 = num1 + 1;
		}

		System.out.println("Using While for descending ==========");

		// print all the numbers from 10 to 1
		// while loop
		int num2 = 10;
		while (num2 > 0) {
			System.out.println(num2);
			num2 = num2 - 1;
		}
		System.out.println("For loop ===========");

		// for loop
		for (int num3 = 1; num3 <= 10; num3++) {
			System.out.println(num3);
		}

		System.out.println("Even number for loop===========");

		for (int num = 2; num <= 50; num += 2) {
			System.out.println(num);
		}

		System.out.println("Using for each===========");

		// for each loop
		int sum = 0;
		int[] arr1 = { 50, 54, 12, 23, 43, 90 };
		for (int value : arr1) {
			System.out.println(value);
			sum = sum + value;

		}
		System.out.println(sum);

		// solution1

		String str = "Automation testing using Selenium and java";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Total number of words are " + count);

		// solution2
		System.out.println("Total number of words are " + str.split(" ").length);
	}

}
