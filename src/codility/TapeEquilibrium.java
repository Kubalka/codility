package codility;

/*
 * Array A represents numbers on a tape.Find minimum absolute
 * difference between the sum of the first part and the sum
 * of the second part.
 */

public class TapeEquilibrium {
	static int solution(int A[]) {
		int rSum = 0;
		int lSum = 0;
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < A.length; i++) {
			int number = A[i];
			rSum = rSum + number;
			// System.out.println("rSum1: " + rSum);
		}
		// System.out.println();

		for (int z = 0; z < A.length - 1; z++) {
			lSum = lSum + A[z];
			rSum = rSum - A[z];
			diff = Math.min(diff, Math.abs(lSum - rSum));
			// System.out.println("lSum: " + lSum);
			// System.out.println("rSum: " + rSum);
			// System.out.println("diff: " + diff);
			// System.out.println();
		}
		return diff;
	}

	public static void main(String[] args) {
		int[] A = { -1000, 1000 };
		System.out.println(solution(A));

	}

}
