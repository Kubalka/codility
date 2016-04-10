package codility;

public class PermMissingElem {

	public static int solution(int[] A) {
		int N = A.length;		
		long total = ((N + 1L) * (N + 2)) / 2;

		for (int i = 0; i < N; i++) {
			total -= A[i];
		}

		return (int) total;
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		System.out.println("Missing value: " + solution(A) + ".");
	}

}
