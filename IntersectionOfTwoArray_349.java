package array;

import java.util.HashSet;

public class IntersectionOfTwoArray_349 {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        
		HashSet<Integer> hs= new HashSet<Integer>();
		HashSet<Integer>hs1= new HashSet<Integer>();
		
		for(int i: nums1) {
			hs.add(i);
		}
		
		for(int i: nums2) {
			if(hs.contains(i)) {
				hs1.add(i);
			}
		}
		
		int[] nums3= new int[hs1.size()];
		int count=0;
		for(int i : hs1) {
			nums3[count]=i;
			count++;
		}
		return nums3;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		
		for (int i : intersection(nums1, nums2)) {
			System.out.println(i);
		}
	}

}
