package Strings;

public class SmallestLetterGreaterThanTheTarget_744 {
	
	public static char nextGreatestLetter(char[] c, char target) {
		
		for(int i=0; i<c.length;i++) {
			if(c[i]>target) {
				return c[i];
			}
		}
		return c[0];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c= {'c','f','j'};
		char target='d';
		
		System.out.println(nextGreatestLetter(c, target));

	}

}
