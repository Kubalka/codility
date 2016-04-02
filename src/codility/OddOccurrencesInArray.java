package codility;

/*
 * A non-empty zero-indexed array A consisting of N integers
 *is given. The array contains an odd number of elements, and 
 *each element of the array can be paired with another element 
 *that has the same value, except for one element that is left
 *unpaired. Find the unpaired element.
 */

public class OddOccurrencesInArray {
	
	public static int solution(int[] A) {
		int unpaired = 0;
		int number = 0;

		for (int k = 0; k < A.length; k++) {
			number = A[k];
			// using binary XOR operator unpaired = unpaired XOR number
			unpaired ^= number;
		}
		return unpaired;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 3, 9, 3, 9, 7, 9 };
		int arr2[] = { 7, 5, 5, 7, 9 };
		int arr3[] = {};

		System.out.println("Unpaired number is: " + solution(arr) + ".");
	}
}
