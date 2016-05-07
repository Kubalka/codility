package codility;

public class PassingCars {
	public static int solution(int[] A) {
		int numCars = 0;
		int y;
		int z = 0;

		for (y = 0; y < A.length; y++)
			for (z = y + 1; z < A.length; z++)
				// System.out.println(A[z]);
				if (A[y] == 0 && A[z] == 1) {
					numCars++;
					//System.out.println("y: " + y + ", z: " + z);
					//System.out.println("A[y]: " + A[y] + ", A[z]: " + A[z] + ", numCars: " + numCars);
				}

		if (numCars > 1000000000)
			return -1;

		return numCars;

	}

	public static void main(String[] args) {
		 int A[] = {0,1,0,1,1};
		// int A[] = {1,0,0,1,1};
		// int A[] = {0,0,1,1,0};
		// int A[] = {1,0,};
		// int A[] = {0};
		// int A[] = {1};
		// int A[] = {};

		System.out.println(solution(A));

	}
}
