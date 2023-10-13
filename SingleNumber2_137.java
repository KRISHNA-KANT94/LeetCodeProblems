package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber2_137 {
	
	 public static int singleNumber(int[] nums) {
		 int a=0;
	      List<Integer> l= new ArrayList<>();
				HashMap<Integer,Integer>map= new HashMap<>();

				for(int i:nums){
					if(map.containsKey(i)){
						map.put(i, map.get(i)+1);
					}else{
						map.put(i,1);
					}
				}

				for(int i: map.keySet()){
					if(map.get(i)<3){
						a=i;
					}
				}
				return a;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {2,2,3,2};
		
		int singleNumber = singleNumber(nums);
		System.out.println(singleNumber);

	}

}
