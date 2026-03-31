package IntegerCode;

public class P3FindSecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 30 };
		if (arr.length < 2) {
			System.out.println("Invalid Input");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest element");
		} else {
			System.out.println(secondLargest);
		}
	}
}
