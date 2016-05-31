package codility;

public class EquiLeader {

	public static int solution(int[] A) {
		int n = A.length;
		if (n == 0) {
			return -1;
		}

		int value = 0;
		int size = 0;
		for (int i = 0; i < n; i++) {
			if (size == 0) {
				size += 1;
				value = A[i];
			} else {
				if (value != A[i]) {
					size -= 1;
				} else {
					size += 1;
				}
			}
		}

		int candidate = -1;
		if (size > 0) {
			candidate = value;
		}

		int leader = -1;
		int count = 0;
		for (int y = 0; y < n; y++) {
			if (A[y] == candidate) {
				count += 1;
			}
			if (count > n / 2) {
				leader = candidate;
			}
		}
		
		int leftCount = 0;
		int equiLeader = 0;
		for (int z = 0; z < n ; z++) {
			if (A[z] == leader) {
				leftCount++;
			}
			if (leftCount > (z + 1) / 2 && (count - leftCount) > (n - (z + 1)) / 2) {
				equiLeader++;
			}
		}
		
		return equiLeader;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 4, 3, 4, 4, 4, 2 };
		System.out.println(solution(A));
	}

}
