package Strings;

public class AddDigit_258 {
	
	 public  static int addDigits(int n) {
		 
		 int a=0;

	        while(n>=10){
	            a=0;

	            while(n>0){
	                a+=n%10;
	                n=n/10;
	            }
	            n=a;

	        }
	        return n;

	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=38;
		
		int addDigits = addDigits(n);
		System.out.println(addDigits);
	}

}
