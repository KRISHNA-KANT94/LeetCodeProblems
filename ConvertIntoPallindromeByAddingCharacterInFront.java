package Strings;

public class ConvertIntoPallindromeByAddingCharacterInFront {

	public static String shortestPalindrome(String s,StringBuilder s1) {
		
		int n= s.length();
		StringBuilder sb= new StringBuilder();
		sb.append(s).reverse();
		
		for(int i=0; i<s.length();i++) {
			if(s.substring(0, n-i).equals(sb.substring(i))) {
				return sb.substring(0, i) + s;
			}
		}
		
		return s;
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";
		
		StringBuilder s1= new StringBuilder();
		
		System.out.println(shortestPalindrome(s, s1));

	}

}
