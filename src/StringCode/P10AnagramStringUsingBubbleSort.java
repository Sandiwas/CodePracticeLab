package StringCode;

public class P10AnagramStringUsingBubbleSort {
	public static void main(String[] args) {
		String str1 = " aMry";
		String str2 = "maRy ";
		char[] arr1 = removeSpaceMakeLowerCase(str1).toCharArray();
		char[] arr2 = removeSpaceMakeLowerCase(str2).toCharArray();
		SortArray(arr1);
		SortArray(arr2);
		
		if (isEquals(arr1, arr2)) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("String is not Anagram");
		}
	}

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ')
				result = result + str.charAt(i);
		}
		return result.toLowerCase();
	}

	public static void SortArray(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static boolean isEquals(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}