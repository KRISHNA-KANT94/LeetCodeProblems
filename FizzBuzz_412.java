package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
	
public static List<String> removeKdigits(int n) {
	
		List<String> l= new ArrayList<String>();
		
		for(int i=1; i<=n;i++) {
			if(i%3==0 && i%5==0) {
				l.add("FizzBuzz");
			}else if(i%3==0) {
				
				l.add("Fizz");
			}else if(i%5==0) {
				l.add("Buzz");
			}else {
				l.add(String.valueOf(i));
			}
		}
		return l;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		
		System.out.println(removeKdigits(n));
	}

}
