package ArrayRotations;

public class A_Program_to_check_if_strings_are_rotations_of_each_other_or_not {

	private static boolean CheckRotations(String str1, String str2) {
		
		if ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1)) {
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
