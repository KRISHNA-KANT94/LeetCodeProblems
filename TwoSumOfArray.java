package array;

import java.util.Arrays;

public class TwoSumOfArray {

	public static int[] twoSum(int[] arr, int target) {
		
		int []arr2= new int[2];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					arr2[i]=i;
					arr2[j]=j;
				}
			}
		}
		
		return arr2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,7,11,15};
		
		System.out.println(Arrays.toString(twoSum(arr, 9))); 
		

	}

}
