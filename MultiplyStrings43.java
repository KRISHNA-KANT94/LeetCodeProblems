package Strings;

import java.math.BigInteger;

public class MultiplyStrings43 {
	
	 public static String multiply(String s1, String s2) {
		     BigInteger a= new BigInteger(s1);
				 BigInteger b= new BigInteger(s2);
				 BigInteger c= a.multiply(b);
				 String s= String.valueOf(c);
				 return s;
		    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="123";
		String s2="456";
		
		 System.out.println(multiply(s1, s2)); 

	}

}
