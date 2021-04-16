package ArrayRotations;

import java.util.Iterator;

/*
 * 문자열에서 == 객체가 같은지를 비교 하는것이지 문자열이 같은것인지를 확인 하는 것이 아니므로 사용해서는 안된다
 *
 * char[] -> String 변환 하는 방법
 * String 생성자
		new String(charArray);
 * String.valueOf()  
		String str = String.valueOf(charArray);
 * 
 * StringBuilder
		StringBuilder sb = new StringBuilder();
	    for (char ch : charArray) {
	        sb.append(ch);
	    }
	    String str = sb.toString();
 * 
 * Stream
		Stream<Character> charStream = Arrays.stream(charArray);
		String str = charStream.map(String::valueOf).collect(Collectors.joining());
 */
public class $01_02_A_Program_to_check_if_strings_are_rotations_of_each_other_or_not {

	public static void main(String[] args) {
		String str1 = "AACD";
		String str2 = "DAAC";// DAAC, CDAA, ACDA, AACD
		boolean bl = CheckRotations(str1, str2);
		System.out.println(bl);
		
	}

	private static boolean CheckRotations(String str1, String str2) {
		// TODO Auto-generated method stub
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] ch = str2.toCharArray(); //char 배열에 String str2를 cher[]형으로 복사한다.
		int leng = ch.length;//문자를 스왑 하는 횟수
		//System.out.println(leng);
		
		while(leng > 0) { // DAAC, CDAA, ACDA, AACD 배열길이만큼 while문을 돌린다.
			if (str1.equals(str2)) { //1. DAAC 2. CDAA 3. ACDA 4. AACD END 5? DAAC = 1번과 겹친다.  
				return true;
			}
			str2 = swap(ch);
			leng--;
		}
				
		return false;
	}
	
	private static String swap(char[] ch) {// 문자열을 1칸씩 시계방향으로 회전 한다.
		// TODO Auto-generated method stub
		int leng = ch.length-1;
		char temp = ch[leng];
		int i;
		for (i = leng; i > 0; i--) {
			ch[i] = ch[i-1];// 4 = A 3 = D
		}
		ch[i] = temp;
		
//		for(int j = 0; j < ch.length; j++) {
//			System.out.println(ch[j]);	
//		}

		return new String(ch);//char[] 배열을 String로 변환 시킨다.
	}

}
