package array;

public class MaxSumOfSubArray_53 {

	// 1st approach by KADANE ALGORITHM;
	public static int MaxSum(int arr[]) {

		int sum = arr[0];
		int sumMax = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (sum >= 0) {
				sum += arr[i];
			} else {
				sum = arr[i];
			}
			if (sum > sumMax) {
				sumMax = sum;
			}
		}
		return sumMax;

	}

	// Naive Approach

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3,4,5};
		int maxSum = 0;

		// System.out.println(MaxSum(arr));

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}

		}
		System.out.println(maxSum);

	}

}
