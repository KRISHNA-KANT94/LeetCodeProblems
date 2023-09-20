package array;

public class PlusOne_66 {

	public static int[] plusOne(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}else {
				arr[i]=0;
			}
		}
		
		int [] arr1= new int[arr.length+1];
		arr1[0]=1;
		return arr1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {9,9,9};
		int [] c=plusOne(arr);
		for (int i : c) {
			System.out.print(i);
		}
		

	}

}
