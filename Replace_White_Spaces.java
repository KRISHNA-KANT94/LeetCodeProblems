package Strings;

import java.util.Scanner;

public class Replace_White_Spaces {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		
		String s= sc.nextLine();
		
		String a= s.replaceAll("\\s", "");
		System.out.println(a);

	}

}
