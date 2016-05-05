package codility;

import java.util.Arrays;

public class PermCheck {

	public static int solution(int[] A) {
		Arrays.sort(A);
		int[] newTable = new int[A.length];

		if (A.length == 0)
			return 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > A.length || A[i] < 1)
				return 0;

			if (newTable[A[i] - 1] == -1) {
				return 0;
			} else {
				newTable[A[i] - 1] = -1;
			}

		}
		return 1;
	}

	public static void main(String[] args) {
		// int[] A = { 4, 1, 3, 2 };
		int[] A = { 4, 1, 3 };
		// int[] A = { 3,4 };
		// int[] A = {};
		// int A[] = {4, 3, 3, 2};
		// int A[] = {1000000000, 2, 1};
		// int A[] = {1000000000, 1000000001, 1000000002};
		// int[] A = {3};

		System.out.println("Solution: " + solution(A));
	}

}
