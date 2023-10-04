package Strings;

public class UglyNumber_263 {
	
	 public static boolean isUgly(int n) {
	        if (n < 1) return false;
	        while (n % 2 == 0) {
	            n /= 2;
	        }
	        while (n % 3 == 0) {
	            n /= 3;
	        }
	        while (n % 5 == 0) {
	            n /= 5;
	        }
	        return n == 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		
		System.out.println(isUgly(n));

	}

}
