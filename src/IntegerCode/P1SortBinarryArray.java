package IntegerCode;

import java.util.Arrays;

public class P1SortBinarryArray {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		int countzero = 0;
		//count zero
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countzero++;
			}
		}
		//Set Zero
		for (int i = 0; i < countzero; i++) {
			arr[i] = 0;
		}
		//set 1
		for (int i = countzero; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
