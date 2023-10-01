package array;

public class MaximumAverageSubArray_643 {

	public static double findMaxAverage(int[] arr, int k) {
		
		// NAIVE APPROACH

//		double maxSum = Integer.MIN_VALUE;
//
//		for (int i = 0; i <= arr.length - k; i++) {
//			int currSum = 0;
//			for (int j = i; j < i + k; j++) {
//				currSum += arr[j];
//
//			}
//			maxSum = Math.max(currSum, maxSum);
//
//		}
//		return maxSum / k;
		
		if(arr.length==1)
			return arr[0];
		
		int wSum=0; double mSum=Integer.MIN_VALUE;
		
		for(int i=0; i<k ;i++) {
			wSum+=arr[i];
		}
		
		for(int i=k;i<arr.length;i++) {
			wSum=wSum-arr[i-k]+arr[i];
			mSum=Math.max(mSum, wSum);
		}
		return mSum/k;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4,0,4,3,3 };
		int k = 4;

		double findMaxAverage = findMaxAverage(arr, k);
		System.out.println(findMaxAverage);

	}

}
