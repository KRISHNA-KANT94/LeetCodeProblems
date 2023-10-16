package Strings;

import java.util.Arrays;

public class ValidAnagram_242 {
	
	public static boolean isAnagram(String s, String t) {
        
       char[] c=s.toCharArray();
       char[] c1=t.toCharArray();
       
       Arrays.sort(c1);
       Arrays.sort(c);
       
       if(Arrays.equals(c, c1)) {
    	   return true;
       }
	return false;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="anagram";
		String t="nagaram";
		
		System.out.println(isAnagram(s, t));

	}

}
