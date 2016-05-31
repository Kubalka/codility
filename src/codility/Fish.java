package codility;

import java.util.Stack;

// 0 - a fish flowing upstream,
// 1 - a fish flowing downstream.

public class Fish {
	public static int solution(int[] A, int[] B) {
		int count = 0;
		Stack<Integer> previousFishes = new Stack<Integer>();

		for (int i = 0; i < A.length; i++) {
			int currentFish = A[i];
			int currentFlow = B[i];
			if (currentFlow == 1) {
				previousFishes.push(currentFish);
			}
			if (!previousFishes.empty() && currentFlow == 0) {

				while (!previousFishes.empty() && currentFish > previousFishes.peek()) {
					previousFishes.pop();
				}
			}
			if (previousFishes.empty() && currentFlow == 0)
				count++;
		}
		
		return count + previousFishes.size();
	}

	public static void main(String[] args) {

		int[] A = { 4, 3, 2, 1, 5 };
		int[] B = { 0, 1, 0, 0, 0 };
		// int[] A = { 4, 3, 2, 1, 5 };
		// int[] B = { 0, 0, 1, 1, 0 };
		// int[] A = { 4, 3 };
		// int[] B = { 0, 1 };
		System.out.println(solution(A, B));

	}

}
