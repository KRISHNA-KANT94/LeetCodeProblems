package Strings;

public class LengthOfLastWord58 {
	
	public static int lengthOfLastWord(String s) {
		
		String[] s1= s.split(" ");
		
		String s2= s1[s1.length-1];
		
		int l=s2.length();
		return l;
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello World";
		
		System.out.println(lengthOfLastWord(s));
		
	}

}
