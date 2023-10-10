package Strings;

import java.util.Stack;

public class RemoveAllAdjacentDuplicate_1047 {

	public static String removeDuplicates(String s) {

		String a = " ";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (!st.isEmpty() && st.peek() == s.charAt(i)) {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}
		while (!st.isEmpty()) {
			a= st.pop()+a;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

}
