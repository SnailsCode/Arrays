package ArrayRotations;
/*
 * 

���� n�� move��ŭ �·� ��� ȸ���� ���� ����Ͻÿ�(��, 32bit�� ���ϰ� 32bit�� �Ѿ�� �ٽ� ȸ���Ͽ� 1���� �������Ͻÿ�)

n >> move
0000 0000 0000 0000 0000 0000 0001 0000 = 16 
0000 0000 0000 0000 0000 0000 0000 0100 = 4(16���� �������� 2�� �̵�)

n << (BIT-move)
= n << 30
0000 0000 0000 0000 0000 0000 0001 0000
0000 0000 0000 0000 0000 0000 0000 0100 = 4(16���� ���������� 30�� �̵�)

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
		int b = n >> move | n << (BIT-move);//BIT 32�� �ʰ��ҽ� �ٽ� 1���� �����ϱ� ��������
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
