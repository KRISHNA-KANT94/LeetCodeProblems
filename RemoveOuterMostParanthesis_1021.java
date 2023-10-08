package Strings;

public class RemoveOuterMostParanthesis_1021 {
	
	public static String removeOuterParentheses(String s) {
		if(s.length()<=2) {
			return " ";
		}
		
		int open=0;
		StringBuilder sb= new StringBuilder();
		for(int i=1; i<s.length();i++) {
			if(s.charAt(i)=='(') {
				open++;
				if(open>0) {
					sb.append('(');
				}
				}else {
					if(open>0) {
						sb.append(')');
					}
						open--;
				}
			}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="(()())(())";
		System.out.println(removeOuterParentheses(s));

	}

}
