package ArrayRotations;

import java.util.Arrays;
/*
주어진 배열에서 rotation만큼 회전하는 배열을작성하시오(단, 한칸식이동하는 알고리즘을 이용 할 것)
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
