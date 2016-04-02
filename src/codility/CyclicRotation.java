package codility;

/*
 * A zero-indexed array A consisting of N integers is given.
 * Rotation of the array means that each element is shifted 
 * right by one index, and the last element of the array is also moved 
 * to the first place.
 */

public class CyclicRotation {

	public static int[] solution(int[] A, int K) {
		if (A.length == 0 || K < 0) {
			System.out.println("Problem!");
		}

		if (A.length != 0) {
			int diff = A.length - K % A.length;
			if (diff > 0) {
				int[] copy = A.clone();
				for (int i = 0; i < A.length; ++i) {
					int j = (i + diff) % A.length;
					A[i] = copy[j];
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;

		solution(A, K);

		for (int z = 0; z < A.length; z++) {
			System.out.print(A[z] + " ");
		}
	}
}
