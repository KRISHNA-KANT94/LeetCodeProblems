package array;

public class NumberOfSubArraySizeKandAverageGreaterOrEqualToThreshold_1343 {
	
	public static int numOfSubarrays(int[] arr, int k, int threshold) {
        
		int wSum=0;int count=0;
		
		for(int i=0; i<k; i++) {
			wSum+= arr[i];
		}
		
		for (int i = k; i <= arr.length; i++) {
		    if (wSum / k >= threshold) {
		        count++;
		    }

		    if (i < arr.length) {
		        wSum = wSum - arr[i - k] + arr[i];
		    }
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {11,13,17,23,29,31,7,5,2,3};
		int k=3;
		int threshold=5;
		
		int numOfSubarrays = numOfSubarrays(arr, k, threshold);
		System.out.println(numOfSubarrays);

	}

}
