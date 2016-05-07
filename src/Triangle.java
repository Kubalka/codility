import java.util.Arrays;

public class Triangle {

	// return 1 - the triangle exists in given array A
	// return 0 - there is no triangular triplet

	static int solution(int A[], int N) {
		Arrays.sort(A);
		if (A.length < 3)
			return 0;

		for (int i = 2; i < A.length; i++) {
			if (A[i - 2] + A[i - 1] > A[i])
				return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		 int[] A = { 10, 2, 5, 1, 8, 20 }; // return 1
		//int[] A = { 10, 50, 5, 1 }; // return 0

		int N = A.length;
		System.out.println(solution(A, N));

	}

}
