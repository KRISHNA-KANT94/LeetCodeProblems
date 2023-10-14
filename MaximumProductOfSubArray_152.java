package array;

public class MaximumProductOfSubArray_152 {
	
	public static int maxProduct(int[] nums) {
		
		int MaxProduct=Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length ;i++) {
			int product=1;
			for(int j=i; j<nums.length;j++) {
				product=product*nums[j];
				MaxProduct=Math.max(product, MaxProduct);
			}
		}
		return MaxProduct;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {2,3,-2,4};
		
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);

	}

}
