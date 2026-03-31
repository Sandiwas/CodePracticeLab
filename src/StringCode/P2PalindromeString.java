package StringCode;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "radAr";
		String result = "";
		str=removeSpaceMakeLowerCase(str);
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		if (str.equals(result)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
	}

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}

}
