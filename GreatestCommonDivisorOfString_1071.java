package Strings;

public class GreatestCommonDivisorOfString_1071 {
	
	public static String gcdOfStrings(String str1, String str2) {
		
		String str3="";
		
		if(str1.contains(str2)) {
			str3=str1.replaceFirst(str2, "");
			return str3;
		}else {
			return " ";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="ABCABC";
		String str2="ABC";
		System.out.println(gcdOfStrings(str1, str2));
	}

}
