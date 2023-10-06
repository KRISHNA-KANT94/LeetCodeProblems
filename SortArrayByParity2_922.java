package array;

public class SortArrayByParity2_922 {
	
	public static int[] sortArrayByParityII(int[] nums) {
		
		int[] nums1=new int[nums.length];
		int j=0,k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				nums1[2*k]=nums[i];
				k++;
			}else {
				nums1[2*j+1]=nums[i];
				j++;
			}
		}
        return nums1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {2,3,4,7,6,9};
		for (int i : sortArrayByParityII(nums)) {
			System.out.println(i);
		}

	}

}
