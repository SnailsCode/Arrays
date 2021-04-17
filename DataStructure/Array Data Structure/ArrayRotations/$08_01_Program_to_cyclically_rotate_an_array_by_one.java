package ArrayRotations;

import java.util.Arrays;
/*
 * �־��� �迭arr�� rotation��ŭ ȸ���ϴ� ���α׷��� �ۼ��Ͻÿ�(��, �ð�������� ȸ���ϴ� �˰������� �ۼ��Ͻÿ�)
 */
public class $08_01_Program_to_cyclically_rotate_an_array_by_one {

	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int rotation = 2;
		String result = CyclicallyRotate(arr, rotation);
		System.out.println(result);
	}

	private static String CyclicallyRotate(int[] arr, int rotation) {
		// TODO Auto-generated method stub
		int leng = arr.length - 1;
		
		while(rotation > 0) {
			int tmp = arr[leng];
			int i;
			for(i = leng; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[i] = tmp;
			rotation --;
		}
		
		return Arrays.toString(arr);
	}
}
