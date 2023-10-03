package Strings;

public class CapitalLetterDetect_520 {
	
	public static boolean detectCapitalUse(String s) {
        
		if(s.equals(s.toLowerCase())) {
			return true;
		}
		if(s.equals(s.toUpperCase())) {
			return true;
		}
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)-'A'<32) {
				return false;
			}
		}
		return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "usA";
		
		System.out.println(detectCapitalUse(s));

	}

}
