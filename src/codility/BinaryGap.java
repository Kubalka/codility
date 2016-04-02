package codility;

/*
 * Maximum binary gap = how many 0 is between 
 * two 1 in the binary form of the number.
 * For instance, for number 20 is binary form 10100,
 * binary gap is 1, because there is no 1 after last two 0.
 * Find the maximum binary gap.
 */

public class BinaryGap {

	public static int solution(int N) {
		int numZero = -1;
		// number of 0 in binary form of N, starting value is -1, after first
		// found 1, the value is changed to 0 and continues counting if
		// relevant.
		int bitValue = 0;
		// value of examined bit (0 or 1)
		int max = 0;
		// max number of 0 in binary gap

		while (N > 0) {
			// while there is the right shift of bits, the value of N is
			// decreasing, cycle is running until N is 0
			bitValue = N & 1;
			// Bitwise AND (or multiplication). If 1 is on current bit in binary
			// form on N, returns 1 to bitValue, otherwise returns 0.In next
			// step, there is the right shift and we are going to test next bit.
			N = N >> 1;
			// right shift to next bit of N. Caution: Right shift causes, that
			// the bits are taken from right to left.
			if (bitValue == 0 && numZero >= 0) {
				// the condition numZero >= 0 tells us, that there was 1 in the
				// beginning of counting. If not, numZero stay the same, because
				// otherwise there is no gap.
				numZero++;
			}

			if (bitValue == 1) {
				max = numZero > max ? numZero : max;
				// if there are more gaps, return number of 0 of the bigger one
				// to max.
				numZero = 0;
				// after findig bit with value 1, resets the numZero to 0.
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(solution(20));
	}
}
