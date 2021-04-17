package ArrayRotations;

import java.util.Arrays;
/*
�־��� �迭���� rotation��ŭ ȸ���ϴ� �迭���ۼ��Ͻÿ�(��, ��ĭ���̵��ϴ� �˰����� �̿� �� ��)
*/
public class $04_02_Program_for_array_rotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int rotation = 3;
		String result = OneByOneRotation(arr, rotation);
		System.out.println(result);
	}

	private static String OneByOneRotation(int[] arr, int rotation) {
		// TODO Auto-generated method stub
		if (arr.length > 1 || rotation > 0) {
			rotation = rotation % arr.length;
		} else {
			return Arrays.toString(arr);
		}
		
		while(rotation > 0) {
			int tmp = arr[0];
			int i;
			for(i = 0; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[i] = tmp;
			
			rotation --;
		}
		return Arrays.toString(arr);
	}
}
