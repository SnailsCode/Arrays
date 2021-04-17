package ArrayRotations;
/*
 * 

정수 n을 move만큼 좌로 우로 회전한 값을 출력하시오(단, 32bit로 정하고 32bit를 넘어갈시 다시 회전하여 1부터 나오게하시오)

n >> move
0000 0000 0000 0000 0000 0000 0001 0000 = 16 
0000 0000 0000 0000 0000 0000 0000 0100 = 4(16에서 왼쪽으로 2번 이동)

n << (BIT-move)
= n << 30
0000 0000 0000 0000 0000 0000 0001 0000
0000 0000 0000 0000 0000 0000 0000 0100 = 4(16에서 오른쪽으로 30번 이동)

		0000 0000 0000 0000 0000 0000 0000 0100 = 4
OR(|)	0000 0000 0000 0000 0000 0000 0000 0100 = 4
------------------------------------------------------
 		0000 0000 0000 0000 0000 0000 0000 0100 = 4
 */
public class $03_01_Rotate_bits_of_a_number {
	
	private final static int BIT = 32;
	
	public static void main(String[] args) {
		 int n = 16;
		 int move = 2;
		 Rightmove(n, move);
		 Lefttmove(n, move);
	}

	private static int Lefttmove(int n, int move) {
		// TODO Auto-generated method stub
		int b = n >> move | n << (BIT-move);//BIT 32를 초과할시 다시 1부터 시작하기 위해적용
		System.out.println(b);
	
		return b;
	}

	private static int Rightmove(int n, int move) {
		// TODO Auto-generated method stub
		int b = n << move | n >> (BIT - move);
		System.out.println(b);
	
		return b;
	}
	
	
}
