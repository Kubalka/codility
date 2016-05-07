package codility;

public class PassingCars {
	public static int solution(int[] A) {
		int numCars = 0, numZeros = 0;
		int i;

		for (i = 0; i < A.length; i++) {
			if (A[i] == 0)
				numZeros++;
			if (A[i] == 1)
				numCars += numZeros;
		}

		if (numCars > 1000000000)
			return -1;

		return numCars;

	}

	public static void main(String[] args) {
		// int A[] = {0,1,0,1,1};
		// int A[] = { 1, 0, 0, 1, 1 };
		// int A[] = {0,0,1,1,0};
		// int A[] = {1,0,};
		// int A[] = {0};
		// int A[] = {1};
		 int A[] = {};

		System.out.println(solution(A));

	}
}
