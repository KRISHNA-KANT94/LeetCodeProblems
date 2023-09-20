package array;

public class SearchInRotatedSortedArray_81 {

	public static boolean search(int[] arr, int target) {
		
		int l=0;
		int mid=0;
		int h=arr.length-1;
		
		while(l<=h) {
			mid=(l+h)/2;
			if(arr[mid]==target) {
				return true;
			}else if(arr[l] <= arr[mid]){
				if(target>=arr[l] && target<arr[mid]) {
					h=mid-1;
				}else {
					l=mid+1;
				}
			}else {
				if(target>arr[mid] && target<=arr[h]) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		}
		return false;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
		int[] arr= {1,0,1,1,1};
		
		System.out.println(search(arr, 0));

	}

}
