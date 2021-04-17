package ArrayRotations;
/*
 * Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
 * (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
 * 
 * ���ڿ� str1�� str2�� ȸ�������� str1�� str2�� ������ true �ƴϸ� false�� ��ȯ�ϴ� ���α׷��� �ۼ� �Ͻÿ�.
 * 
 * 
 */
public class $01_01_A_Program_to_check_if_strings_are_rotations_of_each_other_or_not {

	private static boolean CheckRotations(String str1, String str2) {
		
		if ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1)) {//str1+str1���ؼ� str2�� ������ ȸ�� ���ڿ��̴�.
			return true;
		}
		
		return false; 
	}	

	public static void main(String[] args) {
		String str1 = "AACD";
		String str2 = "ACDA";
		boolean bl = CheckRotations(str1, str2);
		System.out.println(bl);
	}

	
}
