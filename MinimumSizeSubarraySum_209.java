package array;

public class MinimumSizeSubarraySum_209 {
	
	public static int minSubArrayLen(int target, int[] nums) {
		
		int a=Integer.MAX_VALUE;
		for(int i=0; i<nums.length;i++) {
			int sum=0; int count=0;
			for(int j=i; j<nums.length;j++) {
				sum=sum+nums[j];
				count++;
				if(sum>=target) {
					a=Math.min(count, a);
					break;
				}
			}
		}
		if(a==Integer.MAX_VALUE) {
			return 0;
		}else {
			return a;
		}
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,1,1,1,1,1,1,1};
		//1,4,4 // t=4;
		//1,1,1,1,1,1,1,1 //t=11;
		// [2,3,1,2,4,3]
		
		int target=11;
		//7
		
		int minSubArrayLen = minSubArrayLen(target, nums);
		System.out.println(minSubArrayLen);

	}

}
