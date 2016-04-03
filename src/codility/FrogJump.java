package codility;

public class FrogJump {
	public static int solution(int X, int Y, int D){
		int diff = Y - X;
		int numJump = diff/D + ((diff%D == 0) ? 0 : 1);		
		
		return numJump;
	}

	public static void main(String[] args) {

		System.out.println(solution(10, 15, 5));
	}

}
