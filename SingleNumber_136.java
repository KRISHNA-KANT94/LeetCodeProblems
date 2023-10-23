package array;

public class SingleNumber_136 {
	
public static int singleNumber(int[] arr) {
	
	 int count=arr[0];
	
	for(int i=1; i<arr.length;i++) {

		count^=arr[i];
	}
	
	return count;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int [] arr= {4,1,2,1,2};
		
		System.out.println(singleNumber(arr));

	}

}
