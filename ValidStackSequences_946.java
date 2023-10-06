package array;

import java.util.Stack;

public class ValidStackSequences_946 {
	
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		
		Stack<Integer> s= new Stack<>();
		int j=0;
		
		for(int i=0; i<pushed.length;i++) {
			s.push(pushed[i]);
			while(!s.isEmpty() && s.peek()==popped[j]) {
				s.pop();
				j++;
			}
		}
		return s.isEmpty();
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] pushed= {1,2,3,4,5};
		
//		int [] poped= {4,5,3,2,1};
		int [] poped= {4,3,5,1,2};
		
		System.out.println(validateStackSequences(pushed, poped));

	}

}
