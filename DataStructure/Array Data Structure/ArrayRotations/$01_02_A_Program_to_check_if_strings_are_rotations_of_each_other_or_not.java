package ArrayRotations;

import java.util.Iterator;

/*
 * ���ڿ����� == ��ü�� �������� �� �ϴ°����� ���ڿ��� ������������ Ȯ�� �ϴ� ���� �ƴϹǷ� ����ؼ��� �ȵȴ�
 *
 * char[] -> String ��ȯ �ϴ� ���
 * String ������
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
		char[] ch = str2.toCharArray(); //char �迭�� String str2�� cher[]������ �����Ѵ�.
		int leng = ch.length;//���ڸ� ���� �ϴ� Ƚ��
		//System.out.println(leng);
		
		while(leng > 0) { // DAAC, CDAA, ACDA, AACD �迭���̸�ŭ while���� ������.
			if (str1.equals(str2)) { //1. DAAC 2. CDAA 3. ACDA 4. AACD END 5? DAAC = 1���� ��ģ��.  
				return true;
			}
			str2 = swap(ch);
			leng--;
		}
				
		return false;
	}
	
	private static String swap(char[] ch) {// ���ڿ��� 1ĭ�� �ð�������� ȸ�� �Ѵ�.
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

		return new String(ch);//char[] �迭�� String�� ��ȯ ��Ų��.
	}

}
