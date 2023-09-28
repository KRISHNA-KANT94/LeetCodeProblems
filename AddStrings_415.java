package Strings;

import java.math.BigInteger;

public class AddStrings_415 {
	
	public static String addStrings(String num1, String num2) {
		
		BigInteger a= new BigInteger(num1);
		BigInteger b= new BigInteger(num2);
		
	BigInteger	c=a.add(b);
	return c.toString();
	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1="11";
		String num2="123";
		
		String addStrings = addStrings(num1, num2);
		System.out.println(addStrings);
	}

}
