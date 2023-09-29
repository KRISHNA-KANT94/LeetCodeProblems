package array;

public class SingleNonDuplicate_540 {

	public static int singleNonDuplicate(int[] nums) {

		if(nums.length==1) {
			return nums[0];
		}
		
		int count=0;
		int a=0;
		for(int i=0; i<nums.length-1;i=i+2) {
			if(nums[i]!=nums[i+1]) {
				return nums[i];
			}
		}
		return nums[nums.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
//		int[] nums= {1,1,2};

		int singleNonDuplicate = singleNonDuplicate(nums);
		System.out.println(singleNonDuplicate);
	}

}
