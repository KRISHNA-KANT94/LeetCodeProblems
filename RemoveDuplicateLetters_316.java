package Strings;

public class RemoveDuplicateLetters_316 {
	
	public static String removeDuplicateLetters(String s) {
        
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		for(int i=0; i<s.length();i++) {
			for(int j=1; j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bcabc";
		
		System.out.println(removeDuplicateLetters(s));
	}

}
