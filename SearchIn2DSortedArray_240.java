package array;

public class SearchIn2DSortedArray_240 {
	 public static boolean searchMatrix(int[][] arr, int target) {

	        int i=0;
	        int j=arr[0].length-1;
	        
	        while(i<arr.length && j>=0) {
	        	if(arr[i][j]==target) {
	        		return true;
	        	}else if(target<arr[i][j]) {
	        		j--;
	        	}else {
	        		i++;
	        	}
	        }

	        return false;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(searchMatrix(arr, 10));
	}

}
