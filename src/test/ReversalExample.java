package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I am feeling lucky";
		// reverse the string and show in the output
		String str2 = " ";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println(str2);

		int num1 = 10282023;
		// find the sum of all the digits in num1
		int sum = 0;
		while (num1 > 0) {
			sum = sum + num1 % 10;
			num1 = num1 / 10;
		}
		System.out.println(sum);

		// find out the reverse of num1
		int reverseddigit = 0;
		for (int num = 10282023; num > 0; num /= 10) {
			int remainder = num % 10;
			reverseddigit = reverseddigit * 10 + remainder;
		}
		System.out.println(reverseddigit);
		// do not convert this number into string
	}

}
