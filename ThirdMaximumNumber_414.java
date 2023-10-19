package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class ThirdMaximumNumber_414 {
	
	public static int thirdMax(int[] nums) {
		
		TreeSet<Integer> hs = new TreeSet<Integer>();
		
		for(int i : nums) {
			hs.add(i);
		}
		Object[] array = hs.toArray();
		if(array.length<3) {
			return (int) array[array.length-1];
		}
		return (int) array[array.length-3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= {3,2,2,4,1};
		
		int thirdMax = thirdMax(nums);
		System.out.println(thirdMax);
	}

}
