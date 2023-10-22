package array;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size= sc.nextInt();
		
		int [ ] arr = new int[size];
		System.out.println("enter the elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("enter the number");
		int a= sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==a) {
					System.out.println("the addition is" + arr[i] +"  " + arr[j]);
				}
			}
		}

	}

}
