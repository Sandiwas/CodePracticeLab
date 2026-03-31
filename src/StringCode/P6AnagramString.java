package StringCode;

import java.util.Arrays;

public class P6AnagramString {
	public static void main(String[] args) {
		String str1 = "army";
		String str2 = "mary";

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr2, arr2)) {
			System.out.println("Given string is Anagram string");
		} else {
			System.out.print("Given string is not Anagram string");
		}

	}
}
