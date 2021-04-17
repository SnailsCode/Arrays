package ArrayRotations;

import java.util.Arrays;
/*
주어진 배열에서 rotation만큼 회전하는 배열을작성하시오(단, Reversal 알고리즘을 이용 할 것)

Reversal 알고리즘 이란?
		arr
	   /   \
	  /     \
	 A		 B
	 
	 Ar      Br -> r = reverse
	 (ArBr)r	
 */
public class $04_04_Program_for_array_rotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int rotation = 2;
		String result = Reversal(arr, rotation);
		System.out.println(result);
	}

	private static String Reversal(int[] arr, int rotation) {
		// TODO Auto-generated method stub
		if (arr.length > 1 || rotation > 0) {
			rotation = rotation % arr.length;
		} else {
			return Arrays.toString(arr);
		}
		
		reverse(arr, 0, rotation-1);// 1,2 -> 2, 1 -> 2, 1, 3, 4, 5, 6, 7
		reverse(arr, rotation, arr.length-1);// 3, 4, 5, 6, 7 -> 7, 6, 5, 4, 3 -> 2, 1, 7, 6, 5, 4, 3  
		reverse(arr, 0, arr.length-1); // 2, 1, 7, 6, 5, 4, 3 -> 3, 4, 5, 6, 7, 1, 2
		
		return Arrays.toString(arr);
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(start < end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
	}
}
