package array;

public class RotateOfArray2_189 {
	
	public static void rotateOneTime(int arr[], int start, int end) {
		
		while(start<end) {
			int temp= arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}
	
	
	public static void rotate(int arr[], int k) {
		k=k%arr.length; 
		if(k<0) {
			k= arr.length+k;
		}
		// ye agar left rotate karna hua to..
		//pehle 0 se k-1 tak reverse kr denge..
		rotateOneTime(arr, 0, k-1);
		//fir k se last tak reverse kar denge..
		rotateOneTime(arr, k, arr.length-1);
		//fir pure array ko reverse kr denge..
		rotateOneTime(arr, 0, arr.length-1);
		//---------------------------------------------------------------------------------------------
		//wahi agar right rotate karna hua to..
		//pehle pure aaray ko hi reverse rotate kr denge..
//		 reverse(nums, 0, nums.length - 1);
		//fir 0 se k-1 tak karenge..
//		 reverse(nums, 0, k - 1);
		//fir k se nums.length-1 tak...
//		 reverse(nums, k, nums.length - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		
		rotate(arr, 3);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ "");
		}
	}

}
