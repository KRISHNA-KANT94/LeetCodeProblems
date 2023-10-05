package Strings;

import java.util.Stack;

public class BackSpaceStringCompare_844 {
	
public static boolean backspaceCompare(String s, String t) {
		
		Stack<Character> s1= new Stack<>();
		Stack<Character>s2= new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(!s1.isEmpty() && s.charAt(i)=='#') {
				s1.pop();
			}else if(s.charAt(i)=='#'){
				
			}else {
				s1.push(s.charAt(i));
			}
		}
		
		for(int j=0; j<t.length();j++) {
			if(!s2.isEmpty() && t.charAt(j)=='#') {
				s2.pop();
			}else if(t.charAt(j)=='#') {
				
			}else {
				s2.push(t.charAt(j));
			}
		}
		return s1.equals(s2);  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ab#c";
		String t="ad#c";
		
		System.out.println(backspaceCompare(s, t));


	}

}
