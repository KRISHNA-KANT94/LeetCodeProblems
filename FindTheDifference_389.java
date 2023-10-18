package Strings;

public class FindTheDifference_389 {
	
	 public static char findTheDifference(String s, String t) {
		 
		 char result=0;
		 
		 for(char c : s.toCharArray()) {
			 result^=c;
		 }
		 
		 for(char c : t.toCharArray()) {
			 result^=c;
		 }
		return result;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcd";
		String t="abcde";
		
		System.out.println(findTheDifference(s, t));

	}

}
