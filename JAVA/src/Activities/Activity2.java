package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// Initialize the array
		int[] numArr = {10, 77, 25, 20, 54, -11, 10};
		System.out.println("Original Array: " + Arrays.toString(numArr));
		
		int searchNum = 10;
		int totalSum = 30;
		
		System.out.println("Result: " + result(numArr, searchNum, totalSum));
	
	}
	
	public static boolean result(int[] numbers, int searchNum, int totalSum) {
		
		int temp_sum = 0;
		
		for (int number : numbers) {
			if (number == searchNum) {
				temp_sum += searchNum;
				
			}
			if (temp_sum >totalSum) {
				break;
			}
		}
	return temp_sum == totalSum;
}
}


