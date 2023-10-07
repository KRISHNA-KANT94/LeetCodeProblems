package Strings;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
	
	public static String longestCommonPrefix(String[] s) {
		
		Arrays.toString(s);
		
		String s1=s[0];
		String s2=s[s.length-1];
		int count=0;
		
		while(count<s1.length() && count<s2.length()) {
			if(s1.charAt(count)==s2.charAt(count)) {
				count++;
			}else {
				break;
			}
		}
		//return count;
		return s1.substring(0, count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] s= {"flow", "flower", "flat"};
		
		System.out.println(longestCommonPrefix(s));

	}

}
